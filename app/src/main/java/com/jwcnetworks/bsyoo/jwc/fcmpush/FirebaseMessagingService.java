package com.jwcnetworks.bsyoo.jwc.fcmpush;


import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.jwcnetworks.bsyoo.jwc.IntroActivity;
import com.jwcnetworks.bsyoo.jwc.MainActivity;
import com.jwcnetworks.bsyoo.jwc.R;
import com.google.firebase.messaging.RemoteMessage;
import com.jwcnetworks.bsyoo.jwc.hppt.HttpUser;
import com.jwcnetworks.bsyoo.jwc.mainmenu.mypage.MypageActivity;
import com.jwcnetworks.bsyoo.jwc.mainmenu.notice.EventInfoActivity;
import com.jwcnetworks.bsyoo.jwc.model.ModelNotice;
import com.jwcnetworks.bsyoo.jwc.model.ModelUser;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {

    private static final String TAG = "FirebaseMsgService";

    public SharedPreferences pref = null;
    public Integer islevel;
    public Integer ispush;
    public Integer isnumber;

    public String title, message, page, same;

    public ModelUser user = new ModelUser();

    public FirebaseMessagingService() {
    }

    @SuppressLint("WrongThread")
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        // 1. 공유 프레퍼런스 객체를 얻어온다. /data/data/패키지명/shared_prefs/Login.xml
        pref = getSharedPreferences("Login", Context.MODE_PRIVATE);
        islevel = pref.getInt("level_Set", -1);
        ispush = pref.getInt("push_Set", 1);
        isnumber = pref.getInt("number_Set", -1);

        String tit = remoteMessage.getData().get("title").toString();
        String mes = remoteMessage.getData().get("message").toString();
        String type = remoteMessage.getData().get("type").toString();
        String page2 = remoteMessage.getData().get("page").toString();
        String same2 = remoteMessage.getData().get("same").toString();

        title = tit;
        message = mes;
        page = page2;
        same = same2;
        // 대리점 네트워크 /send 타면 type = 2 가 온다. UTF-8 타입
        if (type.equals("2")) {
            try {
                title = URLDecoder.decode(tit, "UTF-8");
                message = URLDecoder.decode(mes, "UTF-8");
                page = URLDecoder.decode(page2, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        if (ispush == 1) { // 푸시 수신여부{
            if (isnumber != -1) { // 로그인 한경우만
                user.setUser_Number(isnumber);
                new FirebaseMessagingService.getLoginInfomation().execute(user);
            } else { // 로그인 안한경우
                PushCheck(remoteMessage.getData().get("level"));
            }
        }
    }

    public void PushCheck(String level) {
        if (level.equals("1")) {        // 모든 사용자에게 푸시주기
            sendPushNotification(title, message);
        }

        else if (same.equals("1")){   // 레벨에 맞는 사람 & 11레벨 이상등급 푸시 알람주기
            if (Integer.valueOf(level) == islevel || islevel >= 11) {
                sendPushNotification(title, message);
            }
        }

        else if (same.equals("2")){  //  레벨이상의 모든 등급 푸시 알람 주기
            if (Integer.valueOf(level) <= islevel){
                sendPushNotification(title, message);
            }
        }
    }

    public void sendPushNotification(String title, String message) {
        System.out.println("received message : " + message);

        Intent intent = null;
        if(page.equals("agency") && islevel >= 10){ // 대리점 네트워크
            intent = new Intent(this, MainActivity.class);
            intent.putExtra("page", "agency");
        } else if(page.equals("dvr") && islevel >= 1){ // DVR 시리얼등록
            intent = new Intent(this, MainActivity.class);
            intent.putExtra("page", "dvr");
        } else if(page.equals("wed")){ // 수요쿠폰
            intent = new Intent(this, MainActivity.class);
            intent.putExtra("page", "wed");
        } else if(page.equals("redfriday")){ // 레드프라이데이
            intent = new Intent(this, MainActivity.class);
            intent.putExtra("page", "redfriday");
        } else {
            intent = new Intent(this, IntroActivity.class);
            intent.putExtra("title", title);
            intent.putExtra("message", message);
            intent.putExtra("page", "normal");
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        //    PendingIntent.FLAG_UPDATE_CURRENT
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent, PendingIntent.FLAG_ONE_SHOT);
        // PendingIntent pendingIntent = PendingIntent.getService(this, 0 /* Request code */, intent, PendingIntent.FLAG_ONE_SHOT);


        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        // contentTitle 과 contentText는 드래그 전에 표시할 내용 입니다.
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.jwc_small_logo_red).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.pushrogo))
                .setContentTitle(title)
                .setContentText("아래로 당겨 주세요 ▼")
                .setAutoCancel(true)
                .setSound(defaultSoundUri).setLights(000000255, 500, 2000)
                // 푸시 드래그 후에 표시될 내용
                .setStyle(new NotificationCompat.BigTextStyle()
                        .setBigContentTitle(title)
                        .bigText(message))
                .setContentIntent(pendingIntent);

        // 푸시 드래그 후에 표시될 내용
        //NotificationCompat.BigTextStyle style = new NotificationCompat.BigTextStyle(notificationBuilder);
        //style.bigText(message).setBigContentTitle("JWC 공지 사항");

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        PowerManager pm = (PowerManager) this.getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock wakelock = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP, "TAG");
        wakelock.acquire(5000);

        notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
    }

    // 회원정보 가져오기
    public class getLoginInfomation extends AsyncTask<ModelUser, Integer, ModelUser> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected ModelUser doInBackground(ModelUser... params) {

            ModelUser count = new HttpUser().getLoginInfomation(user);

            return count;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(ModelUser s) {
            super.onPostExecute(s);

            if (s != null) {
                user = s;
                islevel = user.getLevel();
                PushCheck(String.valueOf(islevel));
            }
        }
    }

    @Override
    public void onMessageSent(String msgId) {
        Log.e(TAG, "onMessageSent: " + msgId);
    }

    @Override
    public void onSendError(String msgId, Exception e) {
        Log.e(TAG, "onSendError: " + msgId);
        Log.e(TAG, "Exception: " + e);
    }
}

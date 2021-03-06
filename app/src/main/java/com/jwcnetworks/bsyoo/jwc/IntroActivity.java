package com.jwcnetworks.bsyoo.jwc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class IntroActivity extends AppCompatActivity {

    public SharedPreferences shortcutSharedPref;
    public boolean isInstalled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //  32번줄까지 앱실행시 아이콘 바로가기생성
        shortcutSharedPref = getSharedPreferences("what", MODE_PRIVATE);
        isInstalled = shortcutSharedPref.getBoolean("isInstalled", false);

        if (!isInstalled) {
            addAppIconToHomeScreen(getApplicationContext());
        }

        FirebaseMessaging.getInstance().subscribeToTopic("notice"); // 푸시 주제
        FirebaseInstanceId.getInstance().getToken();

        // Status bar 색상 설정. (상태바)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.BLACK);
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent fcmintent = getIntent();
                String page = fcmintent.getStringExtra("page");
                String title = fcmintent.getStringExtra("title");
                String message = fcmintent.getStringExtra("message");
                if(page != null) {
                    if (page.equals("normal")) {  // 일반적인 푸시 클릭후 접속
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.putExtra("title", title);
                        intent.putExtra("message", message);
                        intent.putExtra("page", "normal");
                        startActivity(intent);
                        finish();
                    }
                } else {  // 그냥 아이콘 클릭 접속
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("page", "");
                    startActivity(intent);
                    finish();
                }
            }
        }, 2000);
    }

    // 어플 바로가기 아이콘 생성
    private void addAppIconToHomeScreen(Context context) {
        Intent shortcutIntent = new Intent(Intent.ACTION_MAIN);
        shortcutIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        shortcutIntent.setClassName(context, getClass().getName());
        shortcutIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);

        Intent intent = new Intent();
        intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
        intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, getResources().getString(R.string.app_name));
        intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
                Intent.ShortcutIconResource.fromContext(context, R.drawable.myjwc_icon));

        intent.putExtra("duplicate", false);
        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");

        sendBroadcast(intent);

        SharedPreferences.Editor editor = shortcutSharedPref.edit();
        editor.putBoolean("isInstalled", true);
        editor.commit();
    }
}

package com.example.bsyoo.jwc.cctvinstall;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.bsyoo.jwc.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class CctvInstallTabFragment1 extends CctvInstallFragment{

    private View view = null;
    private ImageView cctvinstall_info;

    public CctvInstallTabFragment1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_cctv_install_tab_fragment1, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        cctvinstall_info = (ImageView) view.findViewById(R.id.cctvinstall_info);
        Glide.with(this).load("http://jwcnet.godohosting.com/JWCMALL/etc/guide.jpg").override(720,4000).fitCenter().into(cctvinstall_info);

        // 이미지 줌인, 아웃 (build.gradle 추가)
        PhotoViewAttacher photoview = new PhotoViewAttacher(cctvinstall_info);
        photoview.update();
    }
}

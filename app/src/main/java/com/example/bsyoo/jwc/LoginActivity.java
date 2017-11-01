package com.example.bsyoo.jwc;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView SignUp, IDPWSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Status bar 색상 설정. (상태바)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.RED);
        }

        // 액션바 타이틀 및 배경색
        getSupportActionBar().setTitle("");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xFF000000));
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.jwc_logo_red);

        SignUp = (TextView) findViewById(R.id.SignUp);
        IDPWSearch = (TextView) findViewById(R.id.IDPWSearch);
        // TextView 밑줄 적용
        SpannableString content = new SpannableString("회원가입");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        SignUp.setText(content);
        SpannableString content2 = new SpannableString("아이디/비밀번호 찾기");
        content2.setSpan(new UnderlineSpan(), 0, content2.length(), 0);
        IDPWSearch.setText(content2);
    }
}

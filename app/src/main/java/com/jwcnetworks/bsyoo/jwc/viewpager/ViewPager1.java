package com.jwcnetworks.bsyoo.jwc.viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jwcnetworks.bsyoo.jwc.mainmenu.notice.EventInfoActivity;
import com.jwcnetworks.bsyoo.jwc.R;
import com.jwcnetworks.bsyoo.jwc.model.ModelNotice;

public class ViewPager1 extends Fragment{

    private View view = null;
    private ImageView img;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.viewpager1, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        img = (ImageView) view.findViewById(R.id.mainview1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModelNotice event = new ModelNotice();
                event.setImg_info("http://www.jwcmall.com/shop/data/scriptrotator/5.jpg");
                event.setNotice_title("2TB 무료 업그레이드!");
                Intent intent = new Intent (getContext(), EventInfoActivity.class);
                intent.putExtra("event", event);
                startActivity(intent);
            }
        });
    }
}


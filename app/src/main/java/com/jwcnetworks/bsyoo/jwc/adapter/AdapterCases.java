package com.jwcnetworks.bsyoo.jwc.adapter;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jwcnetworks.bsyoo.jwc.R;
import com.jwcnetworks.bsyoo.jwc.model.ModelCases;

import java.util.ArrayList;
import java.util.List;

public class AdapterCases extends ArrayAdapter<ModelCases> {

    public ArrayList<ModelCases> data = null;

    public AdapterCases(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull List<ModelCases> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    class ViewHolder {
        TextView tv_topic;
        TextView tv_titlename;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        View itemLayout = super.getView(position, convertView, parent);
        ViewHolder viewHolder = (ViewHolder) itemLayout.getTag();

        if(viewHolder == null){
            viewHolder = new ViewHolder();
            viewHolder.tv_topic = (TextView) itemLayout.findViewById(R.id.tv_topic);
            viewHolder.tv_titlename = (TextView) itemLayout.findViewById(R.id.tv_titlename);

            itemLayout.setTag(viewHolder);
        }
        viewHolder.tv_topic.setText(getItem(position).getTopic().toString());
        if(getItem(position).getLevel() ==1 ) {
            viewHolder.tv_titlename.setText(getItem(position).getTitle_Name().toString() + " 님의 블로그");
        } else {
            viewHolder.tv_titlename.setText(getItem(position).getTitle_Name().toString() + " 업체의 블로그");
        }

        return itemLayout;
    }
}

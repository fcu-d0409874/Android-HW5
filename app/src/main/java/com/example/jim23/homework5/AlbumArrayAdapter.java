package com.example.jim23.homework5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem> {
    Context context;

    public AlbumArrayAdapter (Context context, ArrayList<AlbumItem> items){
        super(context ,0 ,items);
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if(convertView == null) {
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listitem, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }

        AlbumItem item = (AlbumItem)getItem(position);
        TextView tv_name = (TextView)itemlayout.findViewById(R.id.itemtv1);
        tv_name.setText(item.name1);
        ImageView iv = (ImageView)itemlayout.findViewById(R.id.img_t1);
        iv.setImageResource(item.teamicon1);
        TextView p1 = (TextView)itemlayout.findViewById(R.id.point1);
        p1.setText(item.point1);
        TextView tv_name2 = (TextView)itemlayout.findViewById(R.id.itemtv2);
        tv_name2.setText(item.name2);
        ImageView iv2 = (ImageView)itemlayout.findViewById(R.id.img_t2);
        iv2.setImageResource(item.teamicon2);
        TextView p2 = (TextView)itemlayout.findViewById(R.id.point2);
        p2.setText(item.point2);

        if(Integer.valueOf(R.id.point1)>Integer.valueOf(R.id.point2)){
            p1.setTextColor(android.graphics.Color.RED);
        }else{
            p2.setTextColor(android.graphics.Color.RED);
        }


        return itemlayout;
    }
}
package com.example.sparken02.examapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;

import java.util.List;

/**
 * Created by sparken02 on 14/6/17.
 */

public class CustomAdapter extends BaseAdapter {


    Context mContext;
    List<Question> postObj;

    public CustomAdapter(Context mContext, List<Question> questionObj) {
        this.mContext = mContext;
        this.postObj = questionObj;
    }

    public CustomAdapter() {
    }

    @Override
    public int getCount() {
        return postObj.size();
    }

    @Override
    public Object getItem(int position) {
        return postObj.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.each_list_row,parent,false);
        Question item = (Question)getItem(position);

        RadioButton radiobutton = (RadioButton)convertView.findViewById(R.id.radioButton);
//        radiobutton.setText(item.);
        return convertView;
    }
}

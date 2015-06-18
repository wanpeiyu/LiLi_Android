package com.kenli.lily.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kenli.lily.PlayActivity;
import com.kenli.lily.R;
import com.kenli.lily.bean.RecordBean;

public class RecordAdapter extends BaseAdapter{

    private ArrayList<RecordBean> recordBeans = new ArrayList<RecordBean>();
    private Context mContext;
    LayoutInflater mLayoutInflater;
    public RecordAdapter(Context context,ArrayList<RecordBean> list){
        mContext = context;
        recordBeans = list;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return recordBeans.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return recordBeans.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public View getView(int arg0, View convertView, ViewGroup arg2) {
        final ViewHolder viewHolder;
        final RecordBean recordBean = recordBeans.get(arg0);
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = mLayoutInflater.inflate(R.layout.ui_record, null);
            viewHolder.mTextViewTitle = (TextView) convertView.findViewById(R.id.text_record_title);
            viewHolder.mTextViewTime = (TextView) convertView.findViewById(R.id.text_record_time);
            viewHolder.mTextViewConut = (TextView) convertView.findViewById(R.id.text_record_conut);
            viewHolder.mTextViewName = (TextView) convertView.findViewById(R.id.text_record_filename);
            viewHolder.mTextViewPlay = (TextView) convertView.findViewById(R.id.text_record_play);
            viewHolder.mTextViewDownload = (TextView) convertView.findViewById(R.id.text_record_download);
            viewHolder.mTextViewDelect = (TextView) convertView.findViewById(R.id.text_record_delete);
            
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        
        viewHolder.mTextViewTitle.setText(recordBean.getTitle());
        viewHolder.mTextViewTime.setText(recordBean.getRecordTime());
        viewHolder.mTextViewConut.setText(recordBean.getRecordConut());
        viewHolder.mTextViewName.setText(recordBean.getFileName());
        viewHolder.mTextViewPlay.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(mContext, PlayActivity.class);
                intent.putExtra("RecordBean", recordBean);
                mContext.startActivity(intent);
            }
        });
        return convertView;
    }

    class ViewHolder {
        TextView mTextViewTitle;
        TextView mTextViewTime;
        TextView mTextViewConut;
        TextView mTextViewName;
        TextView mTextViewPlay;
        TextView mTextViewDownload;
        TextView mTextViewDelect;
        
    }
}

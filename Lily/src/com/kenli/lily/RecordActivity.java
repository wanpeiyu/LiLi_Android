package com.kenli.lily;

import java.util.ArrayList;

import com.kenli.lily.adapter.RecordAdapter;
import com.kenli.lily.bean.RecordBean;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class RecordActivity extends Activity{
    
    private ListView recordListView;
    private ArrayList<RecordBean> recordBeans = new ArrayList<RecordBean>();
    private RecordAdapter recordAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//ÎÞtitle      
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_record);
		
		initDada();
		initView();
		
	}
    private void initDada() {
        RecordBean recordBean;
        for (int i = 0; i < 3; i++) {
            recordBean = new RecordBean();
            recordBean.setTitle("¸èÇú"+i);
            recordBean.setRecordTime("4:50");
            recordBean.setRecordConut("²¥·Å£º100");
            if (i==0) {
               recordBean.setFileName("¹â»ÔËêÔÂ.mp3");
               recordBean.setUrl("http://abv.cn/music/¹â»ÔËêÔÂ.mp3");
            }else if (i == 1) {
                recordBean.setFileName("Ç§Ç§ãÚ¸è.mp3");
                recordBean.setUrl("http://abv.cn/music/Ç§Ç§ãÚ¸è.mp3");
            }else {
                recordBean.setFileName("ºì¶¹.mp3");
                recordBean.setUrl("http://abv.cn/music/ºì¶¹.mp3");
            }
            
            recordBeans.add(recordBean);
        }
    }
    private void initView() {
        // TODO Auto-generated method stub
        recordListView = (ListView)findViewById(R.id.recordListView);
        recordAdapter = new RecordAdapter(this, recordBeans);
        recordListView.setAdapter(recordAdapter);
    }
}

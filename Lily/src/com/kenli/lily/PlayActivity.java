package com.kenli.lily;






import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.kenli.lily.bean.RecordBean;
import com.kenli.lily.utils.Player;

public class PlayActivity extends Activity implements OnClickListener{

    private SeekBar musicProgress;
    private Player player;
    private boolean isPlay = true;//默认为播放状态
    private ImageView mImagePlay;//播放按钮
    private RecordBean recordBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        //无title      
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_play);
        
        recordBean = (RecordBean) getIntent().getSerializableExtra("RecordBean");
        initView();
        new Thread(new Runnable() {

            @Override
            public void run() {
                player.playUrl(recordBean.getUrl());
            }
        }).start();
        
    }
    
    private void initView() {
        // TODO Auto-generated method stub
        musicProgress = (SeekBar) findViewById(R.id.music_progress);
        musicProgress.setOnSeekBarChangeListener(new SeekBarChangeEvent());
        player = new Player(musicProgress);
        mImagePlay = (ImageView)findViewById(R.id.image_play);
        mImagePlay.setOnClickListener(this);
    }

    class SeekBarChangeEvent implements OnSeekBarChangeListener {
        int progress;

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress,
                boolean fromUser) {
            // 原本是(progress/seekBar.getMax())*player.mediaPlayer.getDuration()
            this.progress = progress * player.mediaPlayer.getDuration()
                    / seekBar.getMax();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // seekTo()的参数是相对与影片时间的数字，而不是与seekBar.getMax()相对的数字
            player.mediaPlayer.seekTo(progress);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.image_play:
            if (isPlay) {
                isPlay=false;
                mImagePlay.setBackgroundResource(android.R.drawable.ic_media_pause);
                player.pause();
            }else {
                isPlay=true;
                mImagePlay.setBackgroundResource(android.R.drawable.ic_media_play);
                player.play();
            }
            break;

        default:
            break;
        }
        
    }
    
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        player.stop();
    }
}



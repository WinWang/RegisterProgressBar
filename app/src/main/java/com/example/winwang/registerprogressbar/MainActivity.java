package com.example.winwang.registerprogressbar;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar mPb;
    //定义3个进度的位置
    private int position1 = 16;
    private int position2 =41;
    private int position3 = 67;
    //临时变量记住进度
    private int temp = 16;//默认进度第一个
    private int duration = 20 ; //设置时间

    private Handler mHandler =  new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mPb = (ProgressBar) findViewById(R.id.pb);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);

        /**
         * 第一个
         */
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp>=position1){
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            temp--;
                            mPb.setProgress(temp);
                            if (temp<=position1){
                                return;
                            }
                            mHandler.postDelayed(this,duration);
                        }
                    },duration);
                }else {
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            temp++;
                            mPb.setProgress(temp);
                            if (temp>=position1){
                                return;
                            }
                            mHandler.postDelayed(this,duration);
                        }
                    },duration);
                }
            }
        });

        /**
         * 第二步
         */
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp>=position2){
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            temp--;
                            mPb.setProgress(temp);
                            if (temp<=position2){
                                return;
                            }
                            mHandler.postDelayed(this,duration);
                        }
                    },duration);
                }else {
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            temp++;
                            mPb.setProgress(temp);
                            if (temp>=position2){
                                return;
                            }
                            mHandler.postDelayed(this,duration);
                        }
                    },duration);
                }
            }
        });


        /**
         * 第三部
         */
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp>=position3){
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            temp--;
                            mPb.setProgress(temp);
                            if (temp<=position3){
                                return;
                            }
                            mHandler.postDelayed(this,duration);
                        }
                    },duration);
                }else {
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            temp++;
                            mPb.setProgress(temp);
                            if (temp>=position3){
                                return;
                            }
                            mHandler.postDelayed(this,duration);
                        }
                    },duration);
                }
            }
        });



    }
}

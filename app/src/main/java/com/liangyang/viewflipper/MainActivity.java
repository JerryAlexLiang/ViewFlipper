package com.liangyang.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

/**
 * 创建日期：2017/1/10 on 15:34
 * 作者:杨亮 liangyang
 * 描述:ViewFlipper的使用，仿淘宝头条垂直滚动广告条
 */
public class MainActivity extends AppCompatActivity {

    private ViewFlipper mViewFlipper;
    private ViewFlipper mViewFlipperTwo;
    private ViewFlipper mViewFlipperThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图
        mViewFlipper = (ViewFlipper) findViewById(R.id.vf);
        mViewFlipperTwo = (ViewFlipper) findViewById(R.id.vf_two);
        mViewFlipperThree = (ViewFlipper) findViewById(R.id.vf_three);
        //代码为ViewFlipper添加广告条，使用代码将准备好的东西黏在一起
        //模仿淘宝头条垂直滚动效果
        mViewFlipper.addView(View.inflate(this,R.layout.view_advertisement01,null));
        mViewFlipper.addView(View.inflate(this,R.layout.view_advertisement02,null));
        mViewFlipper.addView(View.inflate(this,R.layout.view_advertisement03,null));

        //水平滚动效果
        mViewFlipperTwo.addView(View.inflate(this,R.layout.view_advertisement01,null));
        mViewFlipperTwo.addView(View.inflate(this,R.layout.view_advertisement02,null));
        mViewFlipperTwo.addView(View.inflate(this,R.layout.view_advertisement03,null));


    }
}

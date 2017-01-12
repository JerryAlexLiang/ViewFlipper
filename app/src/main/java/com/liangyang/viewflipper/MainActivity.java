package com.liangyang.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
    private LinearLayout linearGrid;
    /**
     * 同步小圆点数组
     */
    private ImageView[] gridImages;
    /**
     * 当前显示的图片索引
     */
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图
        mViewFlipper = (ViewFlipper) findViewById(R.id.vf);
        mViewFlipperTwo = (ViewFlipper) findViewById(R.id.vf_two);
        mViewFlipperThree = (ViewFlipper) findViewById(R.id.vf_three);
        linearGrid = (LinearLayout) findViewById(R.id.linear_grid);//同步圆点
        //代码为ViewFlipper添加广告条，使用代码将准备好的东西黏在一起
        //模仿淘宝头条垂直滚动效果
        mViewFlipper.addView(View.inflate(this, R.layout.view_advertisement01, null));
        mViewFlipper.addView(View.inflate(this, R.layout.view_advertisement02, null));
        mViewFlipper.addView(View.inflate(this, R.layout.view_advertisement03, null));

        //水平滚动效果
        mViewFlipperTwo.addView(View.inflate(this, R.layout.view_advertisement01, null));
        mViewFlipperTwo.addView(View.inflate(this, R.layout.view_advertisement02, null));
        mViewFlipperTwo.addView(View.inflate(this, R.layout.view_advertisement03, null));

//        /**
//         * 同步圆点
//         */
//        gridImages = new ImageView[3];
//        for (int i = 0; i < 3; i++) {
//            gridImages[i] = new ImageView(this);
//            gridImages[i].setLayoutParams(new LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.WRAP_CONTENT,
//                    LinearLayout.LayoutParams.WRAP_CONTENT));
//            gridImages[i].setPadding(5, 10, 5, 2);
//            gridImages[i].setImageResource(R.drawable.dot_gray);
//            linearGrid.addView(gridImages[i]);
//        }
//
//        index = 0;
//        gridImages[index].setImageResource(R.drawable.dot_blue);
//
//
//        mViewFlipperThree.showNext();
//        index++;
//        if (index >= 3) {
//            index = 0;
//        }
//        for (int i = 0; i < 3; i++) {
//            if (i != index) {
//                gridImages[i].setImageResource(R.drawable.dot_gray);
//            } else {
//                gridImages[i].setImageResource(R.drawable.dot_blue);
//            }
//        }
    }
}

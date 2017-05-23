package com.summer.bannerlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.summer.bannerlayout.widget.BannerLayout;
import com.summer.bannerlayout.widget.GlideImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BannerLayout bannerLayout ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        bannerLayout = (BannerLayout) findViewById(R.id.bannerLayout);
        final List<String> urls = new ArrayList<>();
        urls.add("http://img3.imgtn.bdimg.com/it/u=2674591031,2960331950&fm=23&gp=0.jpg");
        urls.add("http://img5.imgtn.bdimg.com/it/u=3639664762,1380171059&fm=23&gp=0.jpg");
        urls.add("http://img0.imgtn.bdimg.com/it/u=1095909580,3513610062&fm=23&gp=0.jpg");
        urls.add("http://img4.imgtn.bdimg.com/it/u=1030604573,1579640549&fm=23&gp=0.jpg");
        urls.add("http://img5.imgtn.bdimg.com/it/u=2583054979,2860372508&fm=23&gp=0.jpg");
        //设置图片加载
        bannerLayout.setImageLoader(new GlideImageLoader());
        //添加图片链接集合
        bannerLayout.setViewUrls(urls);
        //添加监听事件
        bannerLayout.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

一款简洁实用的android广告栏，参考了[AndroidImageSlider](https://github.com/daimajia/AndroidImageSlider)和[BGABanner-Android](https://github.com/bingoogolapple/BGABanner-Android)结合自己的理解而成

**xml**
```
 <com.summer.bannerlayout.widget.BannerLayout
        android:id="@+id/bannerLayout"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        app:autoPlayDuration="5000"
        app:indicatorMargin="10dp"
        android:background="#cccccc"
        app:indicatorPosition="centerBottom"
        app:indicatorShape="oval"
        app:indicatorSpace="3dp"
        app:show_count_text="true"
        app:show_indicator="false"
        app:scrollDuration="900"
        app:selectedIndicatorColor="#6eb4ff"
        app:selectedIndicatorHeight="6dp"
        app:selectedIndicatorWidth="6dp"
        app:unSelectedIndicatorColor="#99ffffff"
        app:unSelectedIndicatorHeight="6dp"
        app:unSelectedIndicatorWidth="6dp"></com.summer.bannerlayout.widget.BannerLayout>
        app:unSelectedIndicatorWidth="6dp" />
```

设置使用文字指示器
```
        app:show_count_text="true"
        app:show_indicator="false"
```
设置使用圆点指示器
```
        app:show_count_text="false"
        app:show_indicator="true"
```
设置使用圆点还是方点
```
       app:indicatorShape="oval"
       或者
        app:indicatorShape="rect"
```


**代码中使用**
```
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
```




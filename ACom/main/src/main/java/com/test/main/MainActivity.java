package com.test.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.test.common.EventNews;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {
    private Button image;
    private Button news;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        image = (Button) findViewById(R.id.image);
        news = (Button) findViewById(R.id.news);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imageUrl = "http://img3.imgtn.bdimg.com/it/u=3639899545,1382754270&fm=27&gp=0.jpg";
                ARouter.getInstance().build("/hao/image").withString("imageUrl",imageUrl).navigation();
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/xin/news")
                        .withString("news",news.getText().toString().trim())
                        .navigation();
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void refresh(EventNews eventNews){
        news.setText(eventNews.getNews());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}

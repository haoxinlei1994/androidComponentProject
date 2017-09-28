package com.test.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.test.common.EventNews;

import org.greenrobot.eventbus.EventBus;

@Route(path = "/xin/news")
public class NewsActivity extends AppCompatActivity {
    private EditText editText;
   private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity_layout);
        editText = (EditText) findViewById(R.id.et);
        button = (Button) findViewById(R.id.news);
        String textFromMain = getIntent().getStringExtra("news");
        editText.setText(textFromMain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new EventNews(editText.getText().toString().trim()));
            }
        });
    }
}

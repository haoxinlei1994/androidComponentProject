package com.test.image.module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.test.image.R;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().build("/test/image")
                .withString("imageUrl","http://img3.imgtn.bdimg.com/it/u=3639899545,1382754270&fm=27&gp=0.jpg")
                .navigation();
    }
}

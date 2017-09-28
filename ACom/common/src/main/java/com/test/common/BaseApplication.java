package com.test.common;

import android.app.Application;

/**
 * Created by 郝新磊 on 2017/9/28.
 */

public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ContextUtil.init(this);
    }
}

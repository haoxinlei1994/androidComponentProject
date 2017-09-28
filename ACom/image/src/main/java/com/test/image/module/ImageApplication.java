package com.test.image.module;

import com.alibaba.android.arouter.launcher.ARouter;
import com.test.common.BaseApplication;

/**
 * Created by 郝新磊 on 2017/9/28.
 */

public class ImageApplication extends BaseApplication{
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化自己的路由
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}

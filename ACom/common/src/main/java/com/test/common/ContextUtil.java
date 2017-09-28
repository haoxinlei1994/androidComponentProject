package com.test.common;

import android.content.Context;

/**
 * Created by 郝新磊 on 2017/9/28.
 */

public class ContextUtil {
    private static Context context;
    public static void init(Context ctx){
        context = ctx;
    }
    public static Context getContext(){
        return context;
    }
}

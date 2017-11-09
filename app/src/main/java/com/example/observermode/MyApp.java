package com.example.observermode;

import android.app.Application;
import android.content.Context;

/**
 * Created by 张金瑞 on 2017/11/9.
 */

public class MyApp extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context =  getApplicationContext();
    }
}

package com.example.observermode;

import android.widget.Toast;

/**
 * Created by 张金瑞 on 2017/11/9.
 */

public class ToastUtils {

    private static Toast toast;

    public static void make(String msg){

        if (toast==null){

            toast = Toast.makeText(MyApp.context,"",Toast.LENGTH_SHORT);

        }

        toast.setText(msg);

        toast.show();

    }

}

package com.example.observermode;

/**
 * Created by 张金瑞 on 2017/11/9.
 */

public abstract class TicketInfoListener {

    private static final String TAG = "TicketInfoListener";

    void showTicketInfo(int tag){
        if (tag == 0){
            ToastUtils.make("没票了！" );
        }else {
            ToastUtils.make("有票了！");
        }
        dosomething(tag);
    }

    public abstract void dosomething(int tag);
}

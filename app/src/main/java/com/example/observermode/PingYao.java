package com.example.observermode;

import android.widget.TextView;

/**
 * Created by 张金瑞 on 2017/11/9.
 */

public class PingYao extends TicketInfoListener {

    private TextView textView;

    public PingYao(TextView tv){
        this.textView = tv;
    }


    @Override
    public void dosomething(int tag) {
        if (tag == 1){
            textView.setText("我订到票了！");
        }else {
            textView.setText("我没订到票！");
        }
    }
}

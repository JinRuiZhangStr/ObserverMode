package com.example.observermode;

import java.util.ArrayList;

/**
 * Created by 张金瑞 on 2017/11/9.
 */

public class TrainTicket {

    static ArrayList<TicketInfoListener> listenerlist= new ArrayList<>();
    private static final String TAG = "TrainTicket";


    //订阅车票服务
    public static void buyTicketService(TicketInfoListener listener){
        listenerlist.add(listener);
        ToastUtils.make("订阅成功");
    }

    //解除车票服务
    public static void cancleTicketService(TicketInfoListener listener){

        if (listenerlist==null||listenerlist.isEmpty()){

           ToastUtils.make("没有订阅服务的人");

           return;

        }else {

            if (listenerlist.contains(listener)){

                listenerlist.remove(listener);

                ToastUtils.make("取消成功");

            }else {

                ToastUtils.make("没有这人订阅");
            }

        }

    }

    public static void nofityTicketInfo(int tag){

        if (listenerlist==null||listenerlist.isEmpty()){
            ToastUtils.make("没有人订阅");

            return;

        }

        for (TicketInfoListener listener :listenerlist){

            listener.dosomething(tag);
        }


    }


}

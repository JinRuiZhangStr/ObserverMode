package com.example.observermode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView2)
    TextView tvming;
    @BindView(R.id.tv_hong)
    TextView tvHong;
    @BindView(R.id.ming_show)
    Button mingShow;
    @BindView(R.id.hong_show)
    Button hongShow;
    @BindView(R.id.btn_sub)
    Button btnSub;
    @BindView(R.id.btn_cancle)
    Button btnCancle;
    private PingYao py;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ming_show,R.id.hong_show,R.id.btn_sub,R.id.btn_cancle})
    public void onViewClicked(View view) {
        switch (view.getId()){

            case R.id.ming_show:

                py = new PingYao(tvming);

                TrainTicket.buyTicketService(py);



                break;
            case R.id.hong_show:

                py = new PingYao(tvHong);
                TrainTicket.buyTicketService(py);

                break;
            case R.id.btn_sub:

                TrainTicket.nofityTicketInfo(1);

                break;
            case R.id.btn_cancle:

                TrainTicket.nofityTicketInfo(0);

                break;
        }

    }


    @OnLongClick({R.id.ming_show,R.id.hong_show})
    public boolean onViewLongClicked(View view){

        switch (view.getId()){

            case R.id.ming_show:
                TrainTicket.cancleTicketService(py);

                py = null;


                return  true;

            case R.id.hong_show:
                TrainTicket.cancleTicketService(py);

                py = null;


                return true;

        }

        return true;
    }


}

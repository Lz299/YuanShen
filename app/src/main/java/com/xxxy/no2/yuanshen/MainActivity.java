package com.xxxy.no2.yuanshen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.xxxy.no2.yuanshen.dao.UserDao;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    public Handler hander=new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    textView.setText(msg.obj.toString());
            }
        }
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv1);

        new Thread(new Runnable() {
                @Override
                public void run() {
                    UserDao userDao=new UserDao();
                    int a=userDao.listAll();
                    Log.d("aaaaaaaaaaaaaaaaaaaaa",a+"");

                    Message message = new Message();
                    //给message对象设置what 名字
                    message.what = 1;
                    //给message对象设置obj 内容
                    message.obj = a;
                    //通过Handler机制发送message对象给主线程
                    hander.sendMessage(message);
                }
            }).start();




    }
}
package com.example.lunchservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {

    private boolean isRunning = false;
    private String data = "默认信息";

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
       return new Binder();
    }

    public  class  Binder extends android.os.Binder {
        public void setData(String data){
        MyService.this.data = data;
        }

    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("Service onStartCommand");
        data = intent.getStringExtra("data");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        isRunning = true;
        new Thread() {
            @Override
            public void run() {
                super.run();

                while (isRunning) {
                    try {
                        System.out.println(data);
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        System.out.println("Service onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        isRunning = false;
        System.out.println("Service onDestroy");
    }
}

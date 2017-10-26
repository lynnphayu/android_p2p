package com.example.lynnphayu.mtu;

import android.app.Application;
import android.content.Context;

/**
 * Created by lynnphayu on 9/1/17.
 */

public class globalLoader extends Application {

        private static Context context;
        @Override
        public void onCreate() {
                super.onCreate();
                context =  getApplicationContext();
        }

        @Override
        public void onTerminate(){
                super.onTerminate();
                context = null;
        }
        public static Context getContext(){
                return context;
        }
}

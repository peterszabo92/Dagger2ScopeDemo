package com.example.dagger2scopedemo;

import android.util.Log;

@Application
public class AppScoped {

    public AppScoped() {
        Log.wtf("TAG", "App singleton vagyok");
    }

}

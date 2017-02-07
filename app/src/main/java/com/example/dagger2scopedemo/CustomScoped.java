package com.example.dagger2scopedemo;

import android.util.Log;

public class CustomScoped {

    public CustomScoped() {
        Log.wtf("TAG", "Custom singleton vagyok");
    }

    public void doLog() {
        Log.wtf("TAG", "Custom force log");
    }

}

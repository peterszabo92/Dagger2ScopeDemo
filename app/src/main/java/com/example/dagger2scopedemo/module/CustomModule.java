package com.example.dagger2scopedemo.module;


import com.example.dagger2scopedemo.CustomScoped;

import dagger.Module;
import dagger.Provides;

@Module
public class CustomModule {

    @Provides
    public CustomScoped provideCustomScoped() {
        return new CustomScoped();
    }

}

package com.example.dagger2scopedemo.module;

import com.example.dagger2scopedemo.AppScoped;
import com.example.dagger2scopedemo.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Application
    @Provides
    public AppScoped provideAppScoped() {
        return new AppScoped();
    }

}

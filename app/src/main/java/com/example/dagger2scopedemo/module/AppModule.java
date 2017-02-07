package com.example.dagger2scopedemo.module;

import com.example.dagger2scopedemo.AppScoped;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    public AppScoped provideAppScoped() {
        return new AppScoped();
    }

}

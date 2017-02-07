package com.example.dagger2scopedemo.module;


import com.example.dagger2scopedemo.CustomScoped;
import com.example.dagger2scopedemo.FragmentScope;

import dagger.Module;
import dagger.Provides;

@Module
public class CustomModule {

    @FragmentScope
    @Provides
    public CustomScoped provideCustomScoped() {
        return new CustomScoped();
    }

}

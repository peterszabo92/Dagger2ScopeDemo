package com.example.dagger2scopedemo.component;

import com.example.dagger2scopedemo.AppScoped;
import com.example.dagger2scopedemo.Application;
import com.example.dagger2scopedemo.MainActivity;
import com.example.dagger2scopedemo.module.AppModule;

import dagger.Component;

@Application
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity mainActivity);

    AppScoped getAppScoped();

}

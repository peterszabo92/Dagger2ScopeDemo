package com.example.dagger2scopedemo.component;

import com.example.dagger2scopedemo.AppScoped;
import com.example.dagger2scopedemo.MainActivity;
import com.example.dagger2scopedemo.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity mainActivity);

    AppScoped getAppScoped();

}

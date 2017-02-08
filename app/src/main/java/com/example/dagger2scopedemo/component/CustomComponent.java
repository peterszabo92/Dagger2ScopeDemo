package com.example.dagger2scopedemo.component;

import com.example.dagger2scopedemo.FragmentScope;
import com.example.dagger2scopedemo.MainFragment;
import com.example.dagger2scopedemo.module.CustomModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

@FragmentScope
@Component(dependencies = AppComponent.class, modules = CustomModule.class)
public interface CustomComponent {

    void inject(MainFragment mainFragment);

}

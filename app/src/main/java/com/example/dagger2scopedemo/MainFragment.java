package com.example.dagger2scopedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dagger2scopedemo.component.CustomComponent;
import com.example.dagger2scopedemo.component.DaggerCustomComponent;

import javax.inject.Inject;

public class MainFragment extends Fragment {


    private CustomComponent customComponent;

    @Inject
    AppScoped appScoped;

    @Inject
    CustomScoped customScoped;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customComponent = DaggerCustomComponent
                .builder()
                .appComponent(((MainActivity) getActivity()).getAppComponent())
                .build();
    }

    @Override
    public void onResume() {
        super.onResume();
        customComponent.inject(this);
        customScoped.doLog();
    }
}

package com.example.dagger2scopedemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger2scopedemo.component.AppComponent;
import com.example.dagger2scopedemo.component.DaggerAppComponent;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private AppComponent appComponent;

    private Fragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainFragment = Fragment.instantiate(this, MainFragment.class.getName());
        appComponent = DaggerAppComponent.create();

    }

    private void addFragment() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_container, mainFragment, null)
                .commit();
    }

    private void removeFragment() {
        getSupportFragmentManager().beginTransaction()
                .remove(mainFragment)
                .commit();
    }

    @OnClick(R.id.add)
    public void add() {
        addFragment();
    }

    @OnClick(R.id.remove)
    public void remove() {
        removeFragment();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

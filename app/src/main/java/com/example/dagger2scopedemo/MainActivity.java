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
    private Fragment otherFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainFragment = Fragment.instantiate(this, MainFragment.class.getName());
        otherFragment = Fragment.instantiate(this, OtherFragment.class.getName());
        appComponent = DaggerAppComponent.create();

    }

    private void addFragment() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_container, mainFragment, "main")
                .commit();
    }

    private void replaceFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, otherFragment, "other")
                .addToBackStack("main")
                .commit();
    }

    private void removeFragment() {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("other");
        if (fragment == null) {
            fragment = getSupportFragmentManager().findFragmentByTag("main");
        }
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }

    @OnClick(R.id.add)
    public void add() {
        addFragment();
    }

    @OnClick(R.id.remove)
    public void remove() {
        removeFragment();
    }

    @OnClick(R.id.replace)
    public void replace() {
        replaceFragment();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

package com.xin.sunset;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Sean on 2017/1/6.
 */
public abstract class SingleFragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(android.R.id.content);
        if (fragment == null){
            fragment = createFragment();
            fragmentManager.beginTransaction().add(android.R.id.content,fragment).commit();
        }
    }

    protected abstract Fragment createFragment();
}

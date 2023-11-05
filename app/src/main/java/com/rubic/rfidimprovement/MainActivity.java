package com.rubic.rfidimprovement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rubic.rfidimprovement.base.BaseActivity;
import com.rubic.rfidimprovement.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public ActivityMainBinding binding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onInitViews() {

    }

    @Override
    public void onInitObservers() {

    }
}
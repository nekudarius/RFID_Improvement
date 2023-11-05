package com.rubic.rfidimprovement.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

abstract public class BaseActivity<VB extends ViewBinding> extends AppCompatActivity {

    public abstract VB binding();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding().getRoot());

        onInitViews();
        onInitObservers();
    }

    public abstract void onInitViews();

    public abstract void onInitObservers();

}

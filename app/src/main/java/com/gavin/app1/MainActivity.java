package com.gavin.app1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.gavin.app1.Custom binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setStu(new Student("loader", "山东莱芜"));
    }
}

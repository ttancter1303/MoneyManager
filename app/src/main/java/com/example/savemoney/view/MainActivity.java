package com.example.savemoney.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

import com.example.savemoney.R;

public class MainActivity extends AppCompatActivity {
    NavController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        controller = Navigation.findNavController(this,R.id.nav_host_fragment_container);
        setContentView(R.layout.activity_main);
    }
}
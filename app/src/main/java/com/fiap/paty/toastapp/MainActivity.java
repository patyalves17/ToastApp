package com.fiap.paty.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.fiap.paty.minhabiblioteca.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomToast toast =new CustomToast();
        toast.showToast(getApplicationContext(),"Ola");
    }
}

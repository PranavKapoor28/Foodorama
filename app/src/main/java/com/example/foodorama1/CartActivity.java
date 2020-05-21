package com.example.foodorama1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    String st1;
    String st5;
    String st10;
   TextView tv10;
   TextView tv11;
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        tv10 = findViewById(R.id.t10);
        tv11 = findViewById(R.id.t11);

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);

        st1 = sharedPreferences.getString("whoope1","");
        st5 = sharedPreferences.getString("price1","");
        st10 = sharedPreferences.getString("image1","");

        tv10.setText(st1);
        tv11.setText(st5);

    }
}

package com.example.foodorama1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodRestaurantsActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    String st1;
    String st2;
    String st3;
    String st4;
    String st5;
    String st7;
    String st8;
    String st9;
    String st10;
    String st11;
    String st12;
    String st13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setTitle("Restaurants");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setContentView(R.layout.activity_food_restaurants);
        Button button=findViewById(R.id.b1);
        Button button2=findViewById(R.id.b2);
        Button button3=findViewById(R.id.b3);
        Button button4=findViewById(R.id.b4);

        TextView t1=findViewById(R.id.t1);
        TextView t2=findViewById(R.id.t2);
        TextView t3=findViewById(R.id.t3);
        TextView t4=findViewById(R.id.t4);
        TextView t5=findViewById(R.id.t5);
        TextView t7=findViewById(R.id.t7);
        TextView t8=findViewById(R.id.t8);
        TextView t9=findViewById(R.id.t9);
        ImageView image1=findViewById(R.id.image1);
        ImageView image2=findViewById(R.id.image2);
        ImageView image3=findViewById(R.id.image3);
        ImageView image4=findViewById(R.id.image4);

        st1=t1.getText().toString();
        st2=t2.getText().toString();
        st3=t3.getText().toString();
        st4=t4.getText().toString();
        st5=t5.getText().toString();
        st7=t7.getText().toString();
        st8=t8.getText().toString();
        st9=t9.getText().toString();
        st10=image1.toString();
        st11=image2.toString();
        st12=image3.toString();
        st13=image4.toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("whoope1", st1);
                editor.putString("price1", st5);
                editor.putString("image1", st10);
                editor.apply();
                Intent i = new Intent(getApplicationContext(), CartActivity.class);
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("whoope2", st2);
                editor.putString("price2", st7);
                editor.putString("image2", st11);
                editor.apply();
                Intent intent=new Intent(getApplicationContext(),CartActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("whoope3", st3);
                editor.putString("price3", st8);
                editor.putString("image3", st12);
                editor.apply();
                Intent intent=new Intent(getApplicationContext(),CartActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("whoope4", st4);
                editor.putString("price4", st9);
                editor.putString("image4", st13);
                editor.apply();
                Intent intent=new Intent(getApplicationContext(),CartActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}

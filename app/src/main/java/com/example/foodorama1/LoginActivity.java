package com.example.foodorama1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button button3;
    EditText editText;
    EditText editText2;
    String st;
    String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button3 = findViewById(R.id.button3);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view10) {
                st = editText.getText().toString();
                st1 = editText2.getText().toString();
                if(st.length()==0 || st.contains("(?=.*[0-9])+(?=.*[@#$%^&+=]) +(?=\\\\S+$)"))
                {
                    editText.setError("ENTER A VALID NAME");
                    return;
                }
                if(st1.length()==0)
                {
                    editText2.setError("ENTER A VALID Password");
                    return;
                }

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

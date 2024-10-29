package com.example.splashapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    EditText e1_username,et2_password;
    Button login_button;

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        e1_username=findViewById(R.id.username);
        et2_password=findViewById(R.id.password);
        login_button=findViewById(R.id.btn_login);
        txt=findViewById(R.id.sign);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(e1_username.getText().toString().isEmpty()){
                    e1_username.setError("username cannnot be Empty");
                }
                else if(e1_username.getText().toString().length()<5){
                    e1_username.setError("User must be grater than 5 letters");
                }
                else if(et2_password.getText().toString().isEmpty()){
                    et2_password.setError("Password cannot empty");
                }
                else if(et2_password.getText().toString().length()<5){
                    et2_password.setError("Password must be grater̥ than 5 Letters");
                }
                else{
                    Intent i=new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });


        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
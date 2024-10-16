package com.example.splashapplication;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//This Comment is for GitHub

//This is Secound Comment

public class SplashActivity extends AppCompatActivity {

    @Override  //Annotation
    protected void onCreate(Bundle savedInstanceState) {

        ImageView image;
        TextView text;
        Animation fadeInAnim;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        image=findViewById(R.id.logo);
        text=findViewById(R.id.text);
        fadeInAnim=AnimationUtils.loadAnimation(SplashActivity.this,R.anim.fadein);
        image.setAnimation(fadeInAnim);
        text.setAnimation(fadeInAnim);

        Handler h;  //object deleraction
        h=new Handler(); // object Intrialization
        //Handler h=new Handler()     Shortcut
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this,MainActivity.class);   //Alt+Enter
                startActivity(i);
                finish();
            }
        },4000);


    }

}
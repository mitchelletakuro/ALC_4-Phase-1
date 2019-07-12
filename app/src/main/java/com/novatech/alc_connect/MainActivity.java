package com.novatech.alc_connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   // private Button about_btn;
  //  private Button profile_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // about_btn = (Button) findViewById(R.id.about);
      //  profile_btn = (Button) findViewById(R.id.profile);
    }


    public void About(View view) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }


    public void profile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}


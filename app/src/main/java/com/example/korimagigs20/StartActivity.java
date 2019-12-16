package com.example.korimagigs20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnSignIn) {
            intent = new Intent(this, LoginActivity.class);

        }

        startActivity(intent);
    }
}

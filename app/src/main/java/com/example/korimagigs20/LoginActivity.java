package com.example.korimagigs20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.korimagigs20.Model.Artist;
import com.example.korimagigs20.Model.Grupi;
import com.example.korimagigs20.Model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    EditText edTxtUser, edTxtPass;
    Button btnSignUp;
    Switch mode;
    Intent intent;

    String txtUser;
    String txtPass;

    User[] users = {
            new User(1, "Ironfart", "1234"),
            new User(2, "mfolk", "1234"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Pantalla completa
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_login);

        mode = findViewById(R.id.swMode);
        btnSignUp = findViewById(R.id.btnSignIn);

    }

    public void onClick(View v) {
        if (mode.isChecked()) {
            Intent intento = new Intent(getApplicationContext(), ArtistActivity.class);
            startActivity(intento);
        } else {
            Intent intento = new Intent(getApplicationContext(), UserActivity.class);
            startActivity(intento);
        }
    }
}

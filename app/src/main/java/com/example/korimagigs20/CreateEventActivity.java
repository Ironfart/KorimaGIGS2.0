package com.example.korimagigs20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.korimagigs20.Model.Event;

public class CreateEventActivity extends AppCompatActivity {


    TextView txtName, txtArt, txtPlace, txtDate;
    Button btnAdd;

    String sTxtName, sTxtArt, sTxtPlace, sTxtDate;

    Event event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        txtName = findViewById(R.id.edTxtEvArt);
        txtArt = findViewById(R.id.edTxtEvArt);
        txtPlace = findViewById(R.id.edTxtEvPlace);
        txtDate = findViewById(R.id.edTxtDate);
        btnAdd = findViewById(R.id.btnAdd);

        sTxtName = txtName.getText().toString();
        sTxtArt = txtArt.getText().toString();
        sTxtPlace = txtArt.getText().toString();
        sTxtDate = txtDate.getText().toString();
    }

    public void onCreateEv(View v) {
        if (TextUtils.isEmpty(sTxtName) | TextUtils.isEmpty(sTxtArt) | TextUtils.isEmpty(sTxtPlace) | TextUtils.isEmpty(sTxtDate)){
            Toast.makeText(this, "All parameters must be filled", Toast.LENGTH_SHORT).show();
        } else {
            event = new Event(sTxtName,sTxtDate,sTxtPlace,sTxtArt);
            Intent intent = new Intent();
            intent.putExtra("evento", (Parcelable) event);
            setResult(Activity.RESULT_OK, intent);

            finish();
        }
    }
}

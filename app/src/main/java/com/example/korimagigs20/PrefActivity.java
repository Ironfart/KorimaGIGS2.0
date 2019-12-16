package com.example.korimagigs20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrefActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lsPref;

    String[] pref = {
            "Generos",
            "Lugares",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pref);

        lsPref = findViewById(R.id.lsUsPref);

        lsPref.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pref));
        lsPref.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        Toast.makeText(this, pref[pos], Toast.LENGTH_SHORT).show();
    }
}

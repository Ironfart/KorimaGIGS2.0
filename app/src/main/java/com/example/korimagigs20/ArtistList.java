package com.example.korimagigs20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArtistList extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lstVwArt;
    Intent intent;

    String[] artists = {
            "M-folk",
            "Dayet",
            "Cameltoe",
            "Septimo Angel",
            "Nahual del sol",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);

        lstVwArt = findViewById(R.id.lstVwArtistas);

        lstVwArt.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artists));
        lstVwArt.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        intent = new Intent(ArtistList.this, ArtistDisp.class);

        Bundle b = new Bundle();
        b.putString("name", artists[pos]);

        intent.putExtras(b);

        startActivity(intent);
    }
}

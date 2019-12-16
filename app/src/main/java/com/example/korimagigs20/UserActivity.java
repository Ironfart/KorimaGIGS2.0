package com.example.korimagigs20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.korimagigs20.Model.Event;

public class UserActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lsUser;

    TextView txtUser;
    ImageView imgUser;

    Intent inImg, inLocal, inArtist, inPref;
    private static final int SELECT_PICTURE = 100;

    String[] user = {
            "Artistas",
            "Preferencias",

    };

    Event[] eventos = {
            new Event(),
            new Event("Pedota","2019-12-31","El salon del evin","M-folk y más"),
            new Event("Mas peda","2020-01-11","Parral","M-folk, Dayet, Cameltoe"),
            new Event("Gira ","2020-06-11","España","M-folk"),
            new Event("Cumpleaños","2020-01-10","Hunter","Cameltoe")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        lsUser = findViewById(R.id.lsUser);
        txtUser = findViewById(R.id.txtUser);
        imgUser = findViewById(R.id.imgVwUser);

        lsUser.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,user));
        lsUser.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
        Toast.makeText(this, user[pos], Toast.LENGTH_SHORT).show();
        switch (pos) {
            case 0:
                inArtist = new Intent(UserActivity.this, ArtistList.class);
                startActivity(inArtist);
                break;
            case 1:
                inPref = new Intent(UserActivity.this, PrefActivity.class);
                startActivity(inPref);
                break;
        }
    }
}

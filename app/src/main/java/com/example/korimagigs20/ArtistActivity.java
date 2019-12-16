package com.example.korimagigs20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.korimagigs20.Model.Artist;
import com.example.korimagigs20.Model.Event;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lsEvents;
    Button btnCreate;
    TextView txtArtist, txtGenre, txtLinks;
    ImageView imgArtist;

    Intent inImg, inEvt;
    final int sec = 100;

    Artist[] artists = {
            new Artist(),
    };

    Event[] eventos = {
            new Event(),
            new Event("Pedota","2019-12-31","El salon del evin","M-folk y más"),
            new Event("Mas peda","2020-01-11","Parral","M-folk, Dayet, Cameltoe"),
            new Event("Gira ","2020-06-11","España","M-folk"),
    };

    ArrayList<Event> evt = new ArrayList<Event>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        txtArtist = findViewById(R.id.txtVwArtist);
        txtGenre = findViewById(R.id.txtVwGenre);
        txtLinks = findViewById(R.id.txtVwLinks);
        imgArtist = findViewById(R.id.imgVwArtist);
        lsEvents = findViewById(R.id.lsArtEvent);
        btnCreate = findViewById(R.id.btnCreate);

        lsEvents.setAdapter(new EventAdapter(this, R.layout.list_event, eventos));
        lsEvents.setOnItemClickListener(this);

        txtArtist.setText(artists[0].getName());
        for (int i = 0; i<artists[0].getGenre().length;i++) {
            txtGenre.append(artists[0].getGenre()[i] + " ");
        }

        inEvt = new Intent(this, CreateEventActivity.class);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case sec:
                //algo con los datos
                if (resultCode == Activity.RESULT_OK){
                    //aqui recibimos datos

                } else
                    Toast.makeText(this, "Creación cancelada", Toast.LENGTH_SHORT).show();
                break;
            default:

        }
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    public void onCreateEv(View v) {
        startActivityForResult(inEvt, sec);
    }
}


package com.example.korimagigs20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.korimagigs20.Model.Artist;
import com.example.korimagigs20.Model.Event;

import java.io.InputStream;
import java.net.URL;

public class ArtistDisp extends AppCompatActivity implements ListView.OnItemClickListener {

    TextView txtArtDisp, txtArtDesc, txtArtGen;
    ImageView imgArtist;
    ListView lsEvt;

    Event[] evtMfolk = {
            new Event(),
            new Event("Pedota","2019-12-31","El salon del evin","M-folk y más"),
            new Event("Mas peda","2020-01-11","Parral","M-folk, Dayet, Cameltoe"),
            new Event("Gira ","2020-06-11","España","M-folk"),
    };

    Event[] evtCamel = {
            new Event("Pedota","2019-12-31","El salon del evin","M-folk y más"),
            new Event("Mas peda","2020-01-11","Parral","M-folk, Dayet, Cameltoe"),
            new Event("Cumpleaños","2020-01-10","Hunter","Cameltoe")
    };

    Event[] evtNahual = {
            new Event("Pedota","2019-12-31","El salon del evin","M-folk y más"),
            new Event("Gira ","2020-06-11","España","Nahual del sol"),
    };

    Event[] evtSeptimo = {
            new Event("Pedota","2019-12-31","El salon del evin","M-folk y más"),
            new Event("Leyendas del rock","2020","Mty","Septimo angel")
    };

    Event[] evtDayet = {
            new Event("Pedota","2019-12-31","El salon del evin","M-folk y más"),
            new Event("Mas peda","2020-01-11","Parral","M-folk, Dayet, Cameltoe"),
    };

    String[] genresCamel = {
            "Surf,",
            "Rock,",
            "Horror,",
            "Punk",
    };

    String[] genresNahual = {
            "Rock,",
            "Folk",
    };

    String[] genresSeptimo = {
            "Metal,",
            "Power,",
            "Heavy",
    };

    String[] genresDayet = {
            "Punk,",
            "Rock",
    };

    Artist[] artists = {
            new Artist(),
            new Artist("Cameltoe","default","Horror surf punk", genresCamel),
            new Artist("Nahual del sol","https://vignette.wikia.nocookie.net/alderapedia/images/5/59/Culto_al_Rey_Sol.jpg/revision/latest?cb=20180108175753&path-prefix=es","Que chsm el reggaeton",genresNahual),
            new Artist("Septimo Angel","http://3.bp.blogspot.com/-ka4gi2dn30k/T4j_6LMw4oI/AAAAAAAABD0/4V8AMsfImxE/s1600/fg.jpg","7 angeles bajaron del cielo", genresSeptimo),
            new Artist("Dayet","https://f4.bcbits.com/img/0016750514_10.jpg","Se la Rifan",genresDayet),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_disp);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        String name = b.getString("name");

        txtArtDisp = findViewById(R.id.txtVwArtDisName);
        txtArtDesc = findViewById(R.id.txtVwArtDispDesc);
        txtArtGen = findViewById(R.id.txtVwArtDispGen);
        imgArtist = findViewById(R.id.imgVwArtDisp);
        lsEvt = findViewById(R.id.lsArtDispEvt);

        txtArtDisp.setText(name);

        switch (name) {
            case "M-folk":
                imgArtist.setImageResource(R.drawable.def_user);
                txtArtDesc.setText(artists[0].getDesc());
                for (int i = 0; i<artists[0].getGenre().length;i++) {
                    txtArtGen.append(artists[0].getGenre()[i] + " ");
                }
                lsEvt.setAdapter(new EventAdapter(this, R.layout.list_event, evtMfolk));
                lsEvt.setOnItemClickListener(this);
                break;
            case "Cameltoe":
                imgArtist.setImageResource(R.drawable.def_user);
                txtArtDesc.setText(artists[1].getDesc());
                for (int i = 0; i<artists[1].getGenre().length;i++) {
                    txtArtGen.append(artists[1].getGenre()[i] + " ");
                }
                lsEvt.setAdapter(new EventAdapter(this, R.layout.list_event, evtCamel));
                lsEvt.setOnItemClickListener(this);
                break;
            case "Nahual del sol":
                imgArtist.setImageResource(R.drawable.def_user);
                txtArtDesc.setText(artists[2].getDesc());
                for (int i = 0; i<artists[2].getGenre().length;i++) {
                    txtArtGen.append(artists[2].getGenre()[i] + " ");
                }
                lsEvt.setAdapter(new EventAdapter(this, R.layout.list_event, evtNahual));
                lsEvt.setOnItemClickListener(this);
                break;
            case "Septimo Angel":
                imgArtist.setImageResource(R.drawable.def_user);
                txtArtDesc.setText(artists[3].getDesc());
                for (int i = 0; i<artists[3].getGenre().length;i++) {
                    txtArtGen.append(artists[3].getGenre()[i] + " ");
                }
                lsEvt.setAdapter(new EventAdapter(this, R.layout.list_event, evtSeptimo));
                lsEvt.setOnItemClickListener(this);
                break;
            case "Dayet":
                imgArtist.setImageResource(R.drawable.def_user);
                txtArtDesc.setText(artists[4].getDesc());
                for (int i = 0; i<artists[4].getGenre().length;i++) {
                    txtArtGen.append(artists[4].getGenre()[i] + " ");
                }
                lsEvt.setAdapter(new EventAdapter(this, R.layout.list_event, evtDayet));
                lsEvt.setOnItemClickListener(this);
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}

package com.example.korimagigs20;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.korimagigs20.Model.Event;

public class EventAdapter extends ArrayAdapter<Event> {
    private Context context;
    private int resource;
    Event[] evento;

    public EventAdapter(Context context, int resource, Event[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.evento = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView txtName, txtDate, txtPlace, txtArtist;

        if(convertView == null){
            LayoutInflater iInflator = ((Activity)context).getLayoutInflater();
            convertView = iInflator.inflate(resource,parent,false);
        }

        txtName = convertView.findViewById(R.id.txtVwEvName);
        txtDate = convertView.findViewById(R.id.txtVwDate);
        txtPlace = convertView.findViewById(R.id.txtVwPlace);
        txtArtist = convertView.findViewById(R.id.txtVwEvArtist);

        txtName.setText(evento[position].getName());
        txtDate.setText(evento[position].getDate());
        txtPlace.setText(evento[position].getPlace());
        txtArtist.setText(evento[position].getArtist());

        return convertView;

    }
}

package com.example.korimagigs20.Model;

public class Event {
    private String name;
    private String date;
    private String place;
    private String artist;

    public Event() {
        name = "Folksito";
        date = "2019-12-16";
        place = "Don Burro";
        artist = "M-folk";
    }

    public Event(String name, String date, String place, String artist){
        this.name = name;
        this.date = date;
        this.place = place;
        this.artist = artist;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

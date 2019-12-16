package com.example.korimagigs20.Model;

public class Artist {
    private int id;
    private String name;
    private String imgURL;
    private String desc;
    private String genre[];


    public Artist(){
        id = 2;
        name = "M-folk";
        imgURL = "https://scontent.fcuu2-1.fna.fbcdn.net/v/t1.0-9/22195256_240704213123007_8129630124451119019_n.jpg?_nc_cat=105&_nc_ohc=jHReSlSxeXsAQmNS3wC-eFQ4kHkKlWhEtRS7swVjuQdLMrD5wqZeqMpAw&_nc_ht=scontent.fcuu2-1.fna&oh=fd30b334f99cd605e14c8331d1fe0e36&oe=5E8076DE";
        desc = "Una bola de retrasados";
        genre = new String[]{
                "Metal,",
                "Rock,",
                "Folk,",
                "Mariachi",
        };
    }

    public Artist(String name, String imgURL, String desc, String genre[]) {
        this.name = name;
        this.imgURL = imgURL;
        this.desc = desc;
        this.genre = genre;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }
}

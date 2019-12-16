package com.example.korimagigs20.Model;

public class Grupi {
    private int id;
    private String username;
    private String imageURL;
    private String preference[];

    public Grupi() {
        id = 1;
        username = "Ironfart";
        imageURL = "default";
        preference = new String[] {
            "Metal",
            "Rock",
        };
    }

    public Grupi(int id, String username, String imageURL, String preference[]) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.preference = preference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String[] getPreference() {
        return preference;
    }

    public void setPreference(String[] preference) {
        this.preference = preference;
    }
}

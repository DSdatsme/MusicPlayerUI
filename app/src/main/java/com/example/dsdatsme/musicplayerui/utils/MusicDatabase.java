package com.example.dsdatsme.musicplayerui.utils;

public class MusicDatabase {
    private String artist;
    private String song;
    private int song_URI; //for song link
    //private int albumArt; //for setting albumart

    public MusicDatabase(String artist, String song, int song_URI){
        this.artist = artist;
        this.song = song;
        this.song_URI = song_URI;
        //TODO: set album art here
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setSong_URI(int song_URI) {
        this.song_URI = song_URI;
    }

    public int getSong_URI() {
        return song_URI;
    }

    public String getArtist() {
        return artist;
    }

    public String getSong() {
        return song;
    }

    //TODO: create albumArt getters-setters here
}

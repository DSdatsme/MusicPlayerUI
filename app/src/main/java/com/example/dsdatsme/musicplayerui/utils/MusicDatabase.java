package com.example.dsdatsme.musicplayerui.utils;

public class MusicDatabase {
    private String artist;
    private String song;
    private int songURI; //for song link
    private int albumArt; //for setting albumart



    public MusicDatabase(String artist, String song, int song_URI, int albumArt) {
        this.artist = artist;
        this.song = song;
        this.songURI = song_URI;
        this.albumArt = albumArt;
    }

    public int getSong_URI() {
        return songURI;
    }

    public void setSong_URI(int song_URI) {
        this.songURI = songURI;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getAlbumArt() { return albumArt; }

    public void setAlbumArt(int albumArt) { this.albumArt = albumArt; }


}

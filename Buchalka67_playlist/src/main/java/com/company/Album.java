package com.company;

import java.util.ArrayList;

public class Album {
    private String albumTitle;
    private ArrayList<Song> songsList = new ArrayList<>();

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSongsList() {
        return songsList;
    }

    public void addSongToAlbum(Song newSong) {
        songsList.add(newSong);
    }
}

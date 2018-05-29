package com.company;

import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<Album> albumList = new ArrayList<>();
    private ArrayList<Playlist> playlists = new ArrayList<>();

    public ArrayList<Album> getAlbumList() {
        return albumList;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void addPlaylist(Playlist newPlaylist) {
        playlists.add(newPlaylist);
    }

    public void addAlbum(Album newAlbum) {
        albumList.add(newAlbum);
    }
}

package com.company;

import java.util.LinkedList;

public class Playlist {
    private String playlistTitle;
    private LinkedList<Song> listOfSongs;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.listOfSongs = new LinkedList<Song>();
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public LinkedList<Song> getListOfSongs() {
        return listOfSongs;
    }

    public void addSong(Song song) {
        //TODO check if the song is in album already - if not don't add
        listOfSongs.add(song);
    }
}

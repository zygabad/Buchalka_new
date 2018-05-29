package com.company;

public class MyAudioPlayer {
    private Playlist myPlaylist;
    private PlayerMenu myPlayerMenu;

    public MyAudioPlayer(Playlist myPlaylist) {
        this.myPlaylist = myPlaylist;
        this.myPlayerMenu = new PlayerMenu();
    }

    public Playlist getMyPlaylist() {
        return myPlaylist;
    }
}

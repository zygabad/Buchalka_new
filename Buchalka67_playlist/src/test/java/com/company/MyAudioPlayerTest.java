package com.company;

import org.junit.Test;
import sun.audio.AudioPlayer;

import static org.testng.AssertJUnit.assertEquals;

public class MyAudioPlayerTest {

    private static final String albumTitle = "AlbumBezdroża";
    //private static final ArrayList<Song> songsList  = new ArrayList<>();
    private static final String songTitle = "Bezdroża";
    private static final double duration = 11.3;
    private static final String playlistTitle = "Bezdroża";


    @Test
    public void testCreateMyAudioPlayer() {
        //given
        Playlist newPlaylist = new Playlist(playlistTitle);
        Album newAlbum = new Album(albumTitle);
        MusicLibrary newMusicLibrary = new MusicLibrary();
        Song newsong = new Song(songTitle, duration);
        //when
        newMusicLibrary.addPlaylist(newPlaylist);
        newMusicLibrary.addAlbum(newAlbum);
        newPlaylist.addSong(newsong);
        MyAudioPlayer newAudioPlayer = new MyAudioPlayer(newPlaylist);
        //then
        assertEquals(songTitle, newAudioPlayer.getMyPlaylist().getListOfSongs().get(0).getSongTitle());
    }

}

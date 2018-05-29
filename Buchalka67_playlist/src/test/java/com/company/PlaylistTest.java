package com.company;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PlaylistTest {
    //    private static final String albumTitle = "AlbumBezdroża";
//    private static final ArrayList<Song> songsList  = new ArrayList<>();
    private static final String songTitle = "Bezdroża";
    private static final double duration = 11.3;
    private static final String playlistTitle = "Bezdroża";


    @Test
    public void testCreatePlaylist() {
        //given
        //when
        Playlist newPlaylist = new Playlist(playlistTitle);
        //then
        assertEquals(playlistTitle, newPlaylist.getPlaylistTitle());
    }

    @Test
    public void addSongToPlaylist() {
        //given
        Playlist newPlaylist = new Playlist(playlistTitle);
        Song newSong = new Song(songTitle,duration);
        //when
        newPlaylist.addSong(newSong);
        String addedSongName = newPlaylist.getListOfSongs().get(0).getSongTitle();
        //done
        assertEquals(songTitle,addedSongName);
    }

}

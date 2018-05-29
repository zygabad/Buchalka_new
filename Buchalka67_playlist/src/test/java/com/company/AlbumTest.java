package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class AlbumTest {
    private static final String albumTitle = "AlbumBezdroża";
    private static final ArrayList<Song> songsList  = new ArrayList<>();
    private static final String songTitle = "Bezdroża";
    private static final double duration = 11.3;

    @Test
    public void testCreateAlbum() {
        //given
        //when
        Album newAlbum = new Album(albumTitle);

        //then
        assertEquals(albumTitle, newAlbum.getAlbumTitle());
    }


    @Test
    public void testAddSong() {
        //given
        //when
        Album newAlbum = new Album(albumTitle);
        Song newSong = new Song(songTitle, duration);
        newAlbum.addSongToAlbum(newSong);
        //done
        assertEquals(songTitle, newAlbum.getSongsList().get(0).getSongTitle());
        assertEquals(duration, newAlbum.getSongsList().get(0).getDuration());
    }
}

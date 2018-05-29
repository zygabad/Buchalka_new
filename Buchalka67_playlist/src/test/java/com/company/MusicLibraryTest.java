package com.company;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MusicLibraryTest {

    private static final String albumTitle = "AlbumBezdroża";
    //private static final ArrayList<Song> songsList  = new ArrayList<>();
    private static final String songTitle = "Bezdroża";
    private static final double duration = 11.3;
    private static final String playlistTitle = "Bezdroża";


    @Test
    public void testCreateMusicLibrary() {
        //given
        Playlist newPlaylist = new Playlist(playlistTitle);
        Album newAlbum = new Album(albumTitle);
        Song newSong = new Song(songTitle, duration);
        //when
        MusicLibrary newMusicLibrary = new MusicLibrary();
        newMusicLibrary.addPlaylist(newPlaylist);
        newMusicLibrary.addAlbum(newAlbum);
        newPlaylist.addSong(newSong);
        //then
        assertEquals(playlistTitle, newMusicLibrary.getPlaylists().get(0).getPlaylistTitle());
        assertEquals(albumTitle, newMusicLibrary.getAlbumList().get(0).getAlbumTitle());
        assertEquals(songTitle, newMusicLibrary.getPlaylists().get(0).getListOfSongs().get(0).getSongTitle());
    }

}

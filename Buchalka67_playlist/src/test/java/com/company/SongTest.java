package com.company;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SongTest {
        private static final String songTitle = "Bezdroża";
        private static final double duration = 7.12;

        @Test
        public void testCreateSong() {
            //given

            //when
            Song newSong = new Song(songTitle, duration);
            //then
            assertEquals(songTitle, newSong.getSongTitle());
            assertEquals(duration,newSong.getDuration());
        }

}

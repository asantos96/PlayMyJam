package com.detroitlabs.PlayMyJam.data;

import com.detroitlabs.PlayMyJam.model.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongRepositoryTest {

    @Test
    void findBySongTitle() {
     //Arrange
     SongRepository testSong = new SongRepository();




        //Act
        String result = testSong.getFullPlaylist().get(0).getSongTitle();

       //Assert
       System.out.println("Result " + result);
       assertEquals(result, "song 1");
    }


}
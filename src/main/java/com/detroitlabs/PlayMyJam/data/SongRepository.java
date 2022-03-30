package com.detroitlabs.PlayMyJam.data;

import com.detroitlabs.PlayMyJam.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SongRepository {


   private static final List<Song> fullPlaylist = Arrays.asList(
           new Song("song 1", "songArtist1", 20.0, "m4a"),
           new Song( "song 2", "songArtist2", 21.0, "m4a"),
           new Song( "song 3", "songArtist3", 19.0, "m4a"));


   public List<Song> getFullPlaylist() {
      return fullPlaylist;
   }

   //For loop to go through song names
   public Song findBySongTitle(String songTitle){
      for (Song song: fullPlaylist){
         if (song.getSongTitle().equals(songTitle)){
            return song;
         }
      }
      return null;
   }

   //Method to play
   //Method to pause
   //Method to goToPrevious
   //Method to goToNext
}

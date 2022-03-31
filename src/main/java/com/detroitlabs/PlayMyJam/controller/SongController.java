package com.detroitlabs.PlayMyJam.controller;

import com.detroitlabs.PlayMyJam.data.SongRepository;
import com.detroitlabs.PlayMyJam.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository = new SongRepository();

    @RequestMapping("/")
    public String displayPlaylist(ModelMap modelMap){
        modelMap.put("songs", songRepository.getFullPlaylist());
        return "playlist";
    }

    @RequestMapping("/musicplayer")
    public String displayMusicPlayer(String songTitle, ModelMap modelMap){
        modelMap.put("musicPlayer", songRepository.findBySongTitle("Song 1"));
        return "musicplayer";
    }
}

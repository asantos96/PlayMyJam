package com.detroitlabs.PlayMyJam.model;

public class Song {
    private String songTitle;
    private String songArtist;
    private double songLength;
    private String mediaType;

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Song(String songTitle, String songArtist, double songLength, String mediaType) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songLength = songLength;
        this.mediaType = mediaType;
    }
}

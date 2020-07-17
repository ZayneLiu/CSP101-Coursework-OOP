package com.zayne.coursework;

import java.util.ArrayList;

public class CD extends Item {

    /** The artist of the CD. */
    private String artist;
    /** The number of tracks on the CD. */
    private int numOfTracks;

    // Getters
    public String getArtist() {
        return artist;
    }

    public int getNumOfTracks() {
        return numOfTracks;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setNumOfTracks(int numOfTracks) {
        this.numOfTracks = numOfTracks;
    }

    public void Print(){
        System.out.printf("Title: \t\t%s\n",title);
        System.out.printf("Artist: \t%s\n",artist);
        System.out.printf("Tracks: \t%s\n",numOfTracks);
        System.out.printf("Time: \t\t%s\n",playingTime);
        System.out.printf("Available: \t%s\n",isAvailable);
        System.out.printf("Comments: \t%s\n",comments);
        System.out.println("-------------------");
    }
}

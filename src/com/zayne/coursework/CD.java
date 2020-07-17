package com.zayne.coursework;

import java.util.ArrayList;

public class CD {

    /** The title of the CD. */
    private String title;
    /** The artist of the CD. */
    private String artist;
    /** The number of tracks on the CD. */
    private int numOfTracks;
    /** The running time of the CD. */
    private int playingTime;
    /** Indicates whether the CD is available. */
    private boolean isAvailable;
    /** The comments on the CD. */
    private String comments;

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getNumOfTracks() {
        return numOfTracks;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String getComments() {
        return comments;
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

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

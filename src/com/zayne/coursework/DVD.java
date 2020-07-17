package com.zayne.coursework;

import java.util.ArrayList;

public class DVD {

    public DVD() {

    }

    public DVD(String title, String director, int playingTime, boolean isAvailable, String comments) {
        this.title = title;
        this.director = director;
        this.playingTime = playingTime;
        this.isAvailable = isAvailable;
        this.comments = comments;
    }

    /** The title of the DVD. */
    private String title;
    /** The director of the DVD. */
    private String director;
    /** The running time of the DVD. */
    private int playingTime;
    /** Indicates whether the DVD is available. */
    private boolean isAvailable;
    /** Comments on the DVD. */
    private String comments;

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
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

    public void setDirector(String director) {
        this.director = director;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void Print(){
        System.out.printf("Title: \t\t%s\n",title);
        System.out.printf("Director: \t%s\n",director);
        System.out.printf("Time: \t\t%s\n",playingTime);
        System.out.printf("Available: \t%s\n",isAvailable);
        System.out.printf("Comments: \t%s\n",comments);
        System.out.println("-------------------");
    }

}

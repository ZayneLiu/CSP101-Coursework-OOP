package com.zayne.coursework;

public class Item {

    /** The title of the CD/DVD. */
    protected String title;
    /** The running time of the CD/DVD. */
    protected int playingTime;
    /** Indicates whether the CD/DVD is available. */
    protected boolean isAvailable;
    /** The comments on the CD/DVD. */
    protected String comments;

    // Getters
    public String getTitle() {
        return title;
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
    public void setTitle(String title){
        this.title = title;
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

    }
}

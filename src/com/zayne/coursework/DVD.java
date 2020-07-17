package com.zayne.coursework;

import java.util.ArrayList;

public class DVD extends Item {

    public DVD() {

    }

    /** The director of the DVD. */
    private String director;

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
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

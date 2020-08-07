package com.zayne.coursework;

import java.util.ArrayList;

public class DVD extends Item {

    public DVD() {

    }

    /** The director of the DVD. */
    private String director;

    // Getters
    public String getDirector() {
        return director;
    }

    // Setters
    public void setDirector(String director) {
        this.director = director;
    }

    public void Print(){
        System.out.printf("Title: \t\t%s\n",getTitle());
        System.out.printf("Director: \t%s\n",getDirector());
        System.out.printf("Time: \t\t%s\n",getPlayingTime());
        System.out.printf("Available: \t%s\n",getIsAvailable());
        System.out.printf("Comments: \t%s\n",getComments());
        System.out.println("-------------------");
    }

}

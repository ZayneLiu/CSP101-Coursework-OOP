package com.zayne.coursework;

import java.util.ArrayList;

public class Database {
    public static ArrayList<CD> cdList = new ArrayList<>(10) {
        @Override
        public boolean add(CD cd) {
            // To simulate a fixed capacity as Array.
            if (cdList.size() == 10) {
                System.out.println("CD list is full.");
                return false;
            }
            return super.add(cd);
        }
    };

    public static ArrayList<DVD> dvdList = new ArrayList<>(10) {
        @Override
        public boolean add(DVD dvd) {
            // To simulate a fixed capacity as Array.
            if (dvdList.size() == 10) {
                System.out.println("DVD list is full.");
                return false;
            }
            return super.add(dvd);
        }
    };

    public void addDVD(DVD dvd) {
        dvdList.add(dvd);
    }
    public void addCD(CD cd) {
        cdList.add(cd);
    }

    public void ListAllItems() {
        System.out.println("====== CD ======");
        for (var cd : cdList) {
            cd.Print();
        }
        System.out.println("====== DVD ======");
        for (var dvd : dvdList) {
            dvd.Print();
        }
    }
}

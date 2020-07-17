package com.zayne.coursework;

import java.util.ArrayList;

public class Database {
    // Store CDs/DVDs information
    public static ArrayList<Item> itemList = new ArrayList<>(20) {
        @Override
        public boolean add(Item item) {
            // To simulate a fixed capacity as Array.
            if (itemList.size() == 10) {
                System.out.println("CD list is full.");
                return false;
            }
            return super.add(item);
        }
    };

    /** Add CD/DVD items to the storage */
    public void addItem(Item item) {
        itemList.add(item);
    }

    public void ListAllItems() {
        System.out.println("====== Items ======");
        for (var item : itemList) {
            item.Print();
        }
    }
}

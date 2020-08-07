package com.zayne.coursework;

import java.util.ArrayList;

public class Database {
    // Class member & ArrayList definition.
    /** Store CDs/DVDs information */
    public static ArrayList<Item> itemsList = new ArrayList<>(20) {
        @Override
        public boolean add(Item item) {
            // To simulate a fixed capacity as Array.
            if (itemsList.size() == 20) {
                System.out.println("CD list is full.");
                return false;
            }
            return super.add(item);
        }
    };

    /** Add CD/DVD items to the storage */
    public void addItem(Item item) {
        itemsList.add(item);
    }

    /** Print all item in the database */
    public void ListAllItems() {
        System.out.println("====== Items ======");
        // Foreach loop to iterate through `itemList`
        for (var item : itemsList) {
            item.Print();
        }
    }
}

# Report <!-- omit in toc -->
# Table of Contents <!-- omit in toc -->
- [Procedural](#procedural)
- [OOP](#oop)
- [Differences between Procedural & Object-Oriented Programming Paradigm](#differences-between-procedural--object-oriented-programming-paradigm)
- [Benefits of Inheritance and Polymorphism](#benefits-of-inheritance-and-polymorphism)

# Procedural
```c
// Include statement.
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

// Macro definition.
#define Max_String_Length 30
#define Max_Record_List_Size 10

// `struct` definition.
struct CD
{
	int numberOfTracks;
	bool isAvailable;
    // String definition with fixed length.
	char title[Max_String_Length];
};

// Function definition.
int main(int argc, const char *argv[]){
    // Array of CD definition.
    struct CD cd_list[Max_Record_List_Size];
    // Variable definition and initialisation.
	struct CD cd1, cd2;
	int total_CDs = 0;
	// Assign string value to variable.
	strcpy(cd1.title, "title_CD1");
    // Access struct data.
	cd1.numberOfTracks = 23;
    cd1.isAvailable = false;
    // Add item to array.
	dvd_list[0] = dvd1;
	dvd_list[1] = dvd2;
    // For loop.
	for (int i = 0; i<total_DVDs; i++) {
		printf("%s\n", dvd_list[i].title);
	}
    // Print function
    printf("%s\n", cd_list[i].title);

    return 0;
}

```

# OOP
```java
// Package info (namespace)
package com.zayne.coursework;
// Import statement.
import java.util.ArrayList;

// Class definition.
public class Item {
	// Class member definition
    /** The title of the CD/DVD. */
    protected String title;

    // Getters
    public String getTitle() {
        return title;
    }

    // Setters
    public void setTitle(String title){
        this.title = title;
    }
	// Function definition.
    public void Print(){

    }
}
```
```java
package com.zayne.coursework;
import java.util.ArrayList;

public class Database {
	// Class member & ArrayList definition.
    /** Store CDs/DVDs information */
    public static ArrayList<Item> itemList = new ArrayList<>(20) {
		// Overriding add method.
        @Override
        public boolean add(Item item) {
            // To simulate a fixed capacity as Array.
            if (itemList.size() == 20) {
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

    /** Print all item in the database */
    public void ListAllItems() {
		// Print function
        System.out.println("====== Items ======");
        // Foreach loop to iterate through `itemList`
        for (var item : itemList) {
            item.Print();
        }
    }
}

```

# Differences between Procedural & Object-Oriented Programming Paradigm

- Encapsulation
  - OOP provides the `Class` concept to encapsulate both information and behaviours (fields & methods).


Write a critical comparison on the major differences between two programming paradigms you used in level 1 and level 2. Do not forget to relate to your code where necessary.

# Benefits of Inheritance and Polymorphism
Explain how inheritance and polymorphism makes programming easy to code and understand based on the level 2 and level 3 of your coursework. Do not forget to relate to the code where applicable.
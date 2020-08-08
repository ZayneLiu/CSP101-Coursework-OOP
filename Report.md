# Report <!-- omit in toc -->
# Table of Contents <!-- omit in toc -->
- [Procedural](#procedural)
- [OOP](#oop)
- [Differences between Procedural & Object-Oriented Programming Paradigm](#differences-between-procedural--object-oriented-programming-paradigm)
- [Benefits of Inheritance and Polymorphism](#benefits-of-inheritance-and-polymorphism)
- [References](#references)

# Procedural
The syntax and semantics for procedural programming language (i.e. `C`) will be described in the comments.
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
The syntax and semantics for OOP (object-oriented programming language) (i.e. `Java`) will be described in the comments.

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

    // Property getter syntax
    public String getTitle() {
        return title;
    }

    // Property setter syntax
    public void setTitle(String title){
        this.title = title;
    }
	// Function declaration.
    public void Print(){

    }
}
```
```java
package com.zayne.coursework;
import java.util.ArrayList;

public class Database {
	// Class member & ArrayList definition.
    public static ArrayList<Item> itemList = new ArrayList<>(20) {
		// Overriding add method.
        @Override
        public boolean add(Item item) {
            // `if` statement.
            if (itemList.size() == 20) {
                System.out.println("CD list is full.");
                return false;
            }
            return super.add(item);
        }
    };

    public void addItem(Item item) {
        // Accessing class instance method.
        itemList.add(item);
    }

    public void ListAllItems() {
		// Print function.
        System.out.println("====== Items ======");
        // `foreach` loop.
        for (var item : itemList) {
            item.Print();
        }
    }
}
```

# Differences between Procedural & Object-Oriented Programming Paradigm

Procedural programming paradigm is based on the concept of *"procedure call"*, which is essentially a series of steps or commands executing sequentially. Procedures (a.k.a. routines, subroutines, or functions) are the building blocks of procedural programming, with `if`, `while`, and `for` statement to implement *control flow*  [citation needed].

Control flow can be categorized by their behaviour:
- Branching (i.e. to determine which part of the program should be executed based on certain conditions)
  - `if...else...`
  - `switch...case...`
- Iteration (i.e. to repeatedly execute identical operations)
  - `for` / `foreach`
  - ```c
    // for loop in C.
  	for (int i = 0; i<total_CDs; i++) {
		printf("%s\n", cd_list[i].title);
	}
    ```
___
Object-oriented programming paradigm is based on the concept of modeling real world `objects`, where each kind of objects is called a `class`. Classes encapsulate both `data` (i.e. fields, attributes or properties) and `behaviour` (i.e. methods) of certain object types.
```java
public class Database {
    // Data.
    /** Store CDs/DVDs information */
    public static ArrayList<Item> itemsList = new ArrayList<>(20);

    // Behaviours - START
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
    // Behaviours - END
}
```

Write a critical comparison on the major differences between two programming paradigms you used in level 1 and level 2. Do not forget to relate to your code where necessary.

# Benefits of Inheritance and Polymorphism
Explain how inheritance and polymorphism makes programming easy to code and understand based on the level 2 and level 3 of your coursework. Do not forget to relate to the code where applicable.

<div style="page-break-after: always;"></div>

# References


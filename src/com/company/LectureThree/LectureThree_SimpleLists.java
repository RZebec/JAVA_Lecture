package com.company.LectureThree;

import java.util.ArrayList;
import java.util.List;

public class LectureThree_SimpleLists {
    public static void main(String[] args) {
        List<String> todos = new ArrayList<>();

        todos.add("Zimmer aufräumen");                                                          // .add("Element") adds value to collection (appends at end of list)
        todos.add("Lernen");
        todos.add("Bier kaufen");

        System.out.println("Die TODOs in der Liste sind: " + todos.toString());                 // .toString() returns a string representation such as "[Zimmer aufräumen, Lernen, Bier kaufen]"

        System.out.println("Die Liste hat " + todos.size() + " TODOs");                         // .size() returns the number of elements in the collection

        if (todos.contains("Bier kaufen")) {                                                    // .contains("Element") returns true if the given value is found somewhere in this collection
            System.out.println("Das TODO 'Bier kaufen' befindet sich auf der position Nr. "
                    + (todos.indexOf("Bier kaufen")));                                          // .indexof("Element") returns first index where given value is found in list (-1 if not found)

            todos.set(todos.indexOf("Bier kaufen"), "Wein kaufen");

            System.out.println("Die TODOs in der Liste sind: " + todos.toString());
        } else {
            System.out.println("Das TODO Lernen befindet sich nicht in der Liste");
        }

        todos.remove("Lernen");                                                             // .remove("Element") finds and removes the given value from this collection

        System.out.println("Die TODOs in der Liste sind: ");

        for (int i = 0; i < todos.size(); i++) {                                                // .size() returns the number of elements in the collection
            System.out.println(todos.get(i) + ", ");                                            // .get(index) returns the value at given index
        }
    }
}

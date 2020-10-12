package com.company.LectureThree;

import java.util.ArrayList;
import java.util.List;

public class LectureThree_SimpleLists {
    public static void main(String[] args) {
        List<String> todos = new ArrayList<>();

        todos.add("Zimmer aufraumen");
        todos.add("Lernen");
        todos.add("Bier kaufen");

        System.out.println("Die Todos in der Liste sind:");
        System.out.println(todos.toString());

        System.out.println("Die Liste hat: " + todos.size());

        if (todos.contains("Zimmer aufraumen")) {
            System.out.println("Das Todo Zimmer aufraumen befindet sich in der Liste!");
            System.out.println("Befindet sich an der position: ");
            System.out.println(todos.indexOf("Zimmer aufraumen"));
            System.out.println(todos.get(todos.indexOf("Zimmer aufraumen")));
        }

        todos.remove(0);
        System.out.println(todos.toString());

        todos.set(0, "Wein kaufen");
        System.out.println(todos.toString());


    }
}

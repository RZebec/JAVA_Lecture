package com.company.LectureThree;

import com.company.LectureTwo.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectureThree_ComplexLists {
    public static void main(String... args) throws IOException {
        Student max = new Student(20, "Max", "Mustermann", 1282837, "BW-FS19");
        Student willy = new Student(23, "Willy", "Wanker", 3232123, "BW-FS19");
        Student suzanne = new Student(25, "Suzanne", "Mueller", 1298329, "BW-FS19");
        Student mary = new Student(20, "Mary", "Dean", 1029203, "BW-FS19");
        Student monica = new Student(22, "Monica", "Maier", 1301230, "BW-FS19");

        // the class inside of <> is the defining class for the list elements
        List<Student> students = new ArrayList<>();

        // .add(student) adds value to collection (appends at end of list)
        students.add(max);
        students.add(willy);
        students.add(suzanne);
        students.add(mary);
        students.add(monica);

        // .toString() returns a string representation such as "[Zimmer aufräumen, Lernen, Bier kaufen]"
        System.out.println("Die TODOs in der Liste sind: " + students.toString());

        // .size() returns the number of elements in the collection
        System.out.println("Die Liste hat " + students.size() + " TODOs");

        // .indexof("Element") returns first index where given value is found in list (-1 if not found)
        System.out.println("Max befindet sich auf der position Nr. "
                + (students.indexOf(max)));

        Student willy2 = new Student(23, "Will", "Ferrell", 3232123, "BW-FS20");

        students.set(students.indexOf(willy), willy2);

        System.out.println("Die TODOs in der Liste sind: " + students.toString());

        students.remove("Lernen");                                                          // .remove("Element") finds and removes the given value from this collection

        System.out.println("Die TODOs in der Liste sind: ");

        for (int i = 0; i < students.size(); i++) {                                            // .size() returns the number of elements in the collection
            System.out.println(students.get(i) + ", ");                                        // .get(index) returns the value at given index
        }
    }
}

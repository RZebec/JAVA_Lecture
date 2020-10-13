package com.company.LectureThree;

import com.company.LectureTwo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LectureThree_Streams {

    public static void main(String... args) {
        // the class inside of <> is the defining class for the list elements
        List<Student> students = new ArrayList<>();

        Student max = new Student(20, "Max", "Mustermann", 1282837);
        Student willy = new Student(23, "Willy", "Wanker", 3232123);
        Student suzanne = new Student(25, "Suzanne", "Mueller", 1298329);
        Student mary = new Student(20, "Mary", "Dean", 1029203);
        Student monica = new Student(22, "Monica", "Maier", 1301230);

        // .add(student) adds value to collection (appends at end of list)
        students.add(max);
        students.add(willy);
        students.add(suzanne);
        students.add(mary);
        students.add(monica);

        System.out.println("\nUsing Java Streams: ");

        // Stream Example
        List<Student> above21Students =
                students
                        // .stream() Converts the list to a Java Stream
                        .stream()
                        // Stream operation filter with lambda
                        .filter(student -> student.alter > 21)
                        // Stream operation sorting with lambda
                        // Sorting the elements in a list in descending order by their age
                        .sorted((studentA, studentB) -> {
                            if(studentA.alter < studentB.alter) return -1;
                            if(studentA.alter > studentB.alter) return 1;
                            return 0;
                        })
                        .collect(Collectors.toList());

        // .size() returns the number of elements in the collection
        for (int i = 0; i < above21Students.size(); i++) {
            // .size() returns the number of elements in the collection
            System.out.println(above21Students.get(i) + ", ");
        }
        // Stream Example

        System.out.println("\nUsing FOR Loop: ");
    }
}

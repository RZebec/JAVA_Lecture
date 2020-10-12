package com.company.LectureThree;

import com.company.LectureTwo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LectureThree_ComplexLists {
    public static void main(String[] args) {
        Student max = new Student(21, "Max", "Mustermann",1282837);
        Student willy = new Student(23, "Willy", "Wanker", 3232123);
        Student suzanne = new Student(25, "Suzanne", "Mueller", 1298329);
        Student mary = new Student(20, "Mary", "Dean", 1029203);
        Student monica = new Student(22, "Monica", "Maier", 1301230);

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

        // .remove(willy)
        students.remove(1);

        for(int i=0; i<students.size(); i++) {
            students.get(i).exmatrikulieren();
        }

        List<Student> studentsAbove21 =
                students
                .stream()
                    .filter(student -> student.alter > 21)
                        .sorted((studentA, studentB) -> {
                         if (studentA.alter > studentB.alter)
                             return 1;
                         if (studentA.alter < studentB.alter)
                             return -1;
                         return 0;
                        })
                        // Converts the stream back to being a list
                        .collect(Collectors.toList());

        // .size() returns the number of elements in the collection
        for (int i = 0; i < studentsAbove21.size(); i++) {
            System.out.println(studentsAbove21.get(i) + ", ");
        }
        // function(student) = student.alter > 21
        // student -> student.alter > 21
        // (studentA, studentB) ->

    }
}

package com.company.LectureFour;

import com.company.LectureTwo.Student;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class LectureFour_FilterKickOut {
    public static void main(String[] args) throws IOException {

        // Load the students from the File and add them to the array
        List<Student> students = LectureFour_Methods.readFile("./students.csv");


        // .stream() Converts the list to a Java Stream
        students
                // Stream operation forEach for iterating through the list of students
                // student -> { operation }, the student variable represents each student in the list
                // after the arrow the user can specify a operation which is to be executed
                .forEach(student -> {
                    if (student.alter > 21) {
                        student.exmatrikulieren();
                    }
                });

        students =
                students
                        .stream()
                        // Stream operation sorting with lambda
                        // Sorting the elements in a list in descending order by their age
                        .sorted((studentA, studentB) -> {
                            if (studentA.alter < studentB.alter) return -1;
                            if (studentA.alter > studentB.alter) return 1;
                            return 0;
                        })
                        .collect(Collectors.toList());

        // Write students back to the file
        LectureFour_Methods.writeFile(students, "./above21StudentsKickedOut.csv");
    }
}

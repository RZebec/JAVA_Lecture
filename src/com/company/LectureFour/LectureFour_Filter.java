package com.company.LectureFour;

import com.company.LectureTwo.Student;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class LectureFour_Filter {
    public static void main(String[] args) throws IOException {

        // Load the students from the File and add them to the array
        List<Student> students = LectureFour_Methods.readFile("./students.csv");

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

        // Write students back to the file
        LectureFour_Methods.writeFile(above21Students, "./above21Students.csv");
    }
}

package com.company.LectureFour;

import com.company.LectureTwo.Student;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class LectureFour_Filter {
    public static void main(String[] args) throws IOException {

        // Load the students from the File and add them to the array
        List<Student> students = LectureFour_Methods.readFile("./students.csv");

        // TODO: Filter out the students which are above 21 and write them to a separate file

        // Write students back to the file
        // LectureFour_Methods.writeFile(above21Students, "./above21Students.csv");
    }
}

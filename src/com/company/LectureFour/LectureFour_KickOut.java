package com.company.LectureFour;

import com.company.LectureTwo.Student;

import java.io.IOException;
import java.util.List;

public class LectureFour_KickOut {
    public static void main(String[] args) throws IOException {

        // Load the students from the File and add them to the array
        List<Student> students = LectureFour_Methods.readFile("./students.csv");

        // TODO: Iterate through the list of students and kick every one out
        for(int i=0; i<students.size(); i++) {
            students.get(i).exmatrikulieren();
        }

        // Write students back to the file
        LectureFour_Methods.writeFile(students, "./kickedOutStudents.csv");
    }
}

package com.company.LectureFour;

import com.company.LectureTwo.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectureFour_Read {
    public static void main(String... args) throws IOException {
        // List of Students
        List<Student> students = new ArrayList<>();

        // The variable is used to access each row individually in a file
        String row;

        // Specify the file path here
        String csvPfad = "./students.csv";

        // Create a connection to the file on the computer
        BufferedReader csvReader = new BufferedReader(new FileReader(csvPfad));

        // The while loop is used to read each line in a file and to temporarily
        // save the value to the row variable
        // If the file has no more lines to read, it will quit the loop
        while ((row = csvReader.readLine()) != null) {

            // The data from the row will be saved to a String array after its
            // been split up into values by the delimiter ","
            String[] data = row.split(",");

            String status = data[5];
            String kurs = data[4];
            int alter = Integer.parseInt(data[3]);
            String name = data[2];
            String nachname = data[1];
            int matrikellNummer = Integer.parseInt(data[0]);

            Student student = new Student(alter, name, nachname, matrikellNummer, kurs);

            if (status.equals("exmatrikuliert")) {
                student.exmatrikulieren();
            }

            students.add(student);
        }

        // Close connection to the file on the computer
        csvReader.close();
    }
}

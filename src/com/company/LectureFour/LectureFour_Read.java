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

        // TODO: Create a connection to the file on the computer
        BufferedReader csvReader = new BufferedReader(new FileReader(csvPfad));

        // TODO: The while loop is used to read each line in a file and to temporarily
        // save the value to the row variable
        // If the file has no more lines to read, it will quit the loop
        // while (true) {}
        // while (student == "max")
        while ((row = csvReader.readLine()) != null) {
            // TODO: The data from the row will be saved to a String array after its
            // been split up into values by the delimiter ","
            // row = 1282837,Mustermann,Max,20,immatrikuliert
            // data[0] = 1282837
            // data[1] = Mustermann
            String[] data = row.split(",");

            int matrikellNummer = Integer.parseInt(data[0]);
            String nachname = data[1];
            String name = data[2];
            int alter = Integer.parseInt(data[3]);
            String status = data[4];

            // TODO: the data from the row is mapped to the student object
            Student student = new Student(alter, name, nachname, matrikellNummer);

            if(status.equals("exmatrikuliert")) {
                student.exmatrikulieren();
            }
            // TODO: add student to list
            students.add(student);
        }

        // TODO: Close connection to the file on the computer
        csvReader.close();
    }
}

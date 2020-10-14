package com.company.LectureFour;

import com.company.LectureTwo.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LectureFour_Methods {

    public static List<Student> readFile(String filePath) throws IOException {
        // List of Students
        List<Student> students = new ArrayList<>();

        // The variable is used to access each row individually in a file
        String row;

        // Specify the file path here
        String csvPfad = filePath;

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

        return students;
    }

    public static void writeFile(List<Student> students, String filePath) throws IOException {
        // Specify the file name and path here
        File file = new File(filePath);

        // Checks if the file already exists and if not, creates a new one
        if (!file.exists()) {
            file.createNewFile();
        }

        // Opens a connection to the file on the computer
        BufferedWriter csvWriter = new BufferedWriter(new FileWriter(file));

        // Iterates through the list of students and adds each of them to the file
        // Writes a textual content (String) to the file
        // The entries are split into rows, after every entry the line break character "\n" is added
        for(int i=0; i<students.size(); i++) {
            csvWriter.write(students.get(i).toString() + "\n");
        }

        // Closes the connection to the file on the computer hard drive
        csvWriter.close();
    }
}

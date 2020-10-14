package com.company.LectureFour;

import com.company.LectureTwo.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectureFour_Write {
    public static void main(String[] args) throws IOException {
        Student max = new Student(20, "Max", "Mustermann", 1282837, "BW-FS19");
        Student willy = new Student(23, "Willy", "Wanker", 3232123, "DBM-19");
        Student suzanne = new Student(25, "Suzanne", "Mueller", 1298329, "DBM-19");
        Student mary = new Student(20, "Mary", "Dean", 1029203, "BW-PM19D");
        Student monica = new Student(22, "Monica", "Maier", 1301230, "INF-19A");
        Student philip = new Student(20, "Philip", "Mueller", 1282837, "WIW-19IPL");
        Student chantal = new Student(18, "Chantal", "Lange", 3232123, "STBUF-19");
        Student stefan = new Student(19, "Stefan", "Biermann", 1298329, "BWLH-19");
        Student till = new Student(26, "Till", "Franke", 1029203, "WI-19");
        Student emelie = new Student(23, "Emelie", "Beck", 1301230, "DBM-19");

        List<Student> students = new ArrayList<>();

        // .add(student) adds value to collection (appends at end of list)
        students.add(max);
        students.add(willy);
        students.add(suzanne);
        students.add(mary);
        students.add(monica);
        students.add(philip);
        students.add(chantal);
        students.add(stefan);
        students.add(till);
        students.add(emelie);

        int tillIndex = students.indexOf(till);

        students.get(tillIndex).exmatrikulieren();

        // Specify the file name and path here
        File file = new File("./students.csv");

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

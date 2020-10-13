package com.company.LectureThree;

import com.company.LectureTwo.Student;

import java.util.ArrayList;
import java.util.List;

public class LectureThree_Streams_Alternative {
    public static void main(String[] args) {

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

        // Alternative using FOR loop
        List<Student> above21StudentsAlternative = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {

            Student student = students.get(i);

            if (student.alter > 21) {
                above21StudentsAlternative.add(student);
            }
        }

        Student temp;

        int sizeOfStudentList = above21StudentsAlternative.size();

        for (int i = 0; i < sizeOfStudentList - 1; i++) {
            for (int j = 0; j < sizeOfStudentList - i - 1; j++) {

                Student studentA = above21StudentsAlternative.get(j);

                Student studentB = above21StudentsAlternative.get(j+1);

                if (studentA.alter > studentB.alter) {
                    temp = new Student(studentA.alter, studentA.name, studentA.nachname, studentA.getMatrikelNummer());
                    above21StudentsAlternative.set(j, studentB);
                    above21StudentsAlternative.set(j+1, temp);
                }
            }
        }

        // .size() returns the number of elements in the collection
        for (int i = 0; i < above21StudentsAlternative.size(); i++) {
            // .get(index) returns the value at given index
            System.out.println(above21StudentsAlternative.get(i) + ", ");
        }
        // Alternative using FOR loop
    }
}

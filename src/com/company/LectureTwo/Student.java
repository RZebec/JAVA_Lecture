package com.company.LectureTwo;

public class Student {
    public int alter;
    public String name;
    public String nachname;
    private int matrikelNummer;
    private boolean exmatrikuliert;

    public Student(int _alter, String _name, String _nachname, int _matrikelNummer) {
        this.alter = _alter;
        this.name = _name;
        this.nachname = _nachname;
        this.matrikelNummer = _matrikelNummer;
        this.exmatrikuliert= false;

        System.out.println("Student " + nachname + " " + name + " wurde angelegt!");
    }

    public void exmatrikulieren() {
        this.exmatrikuliert = true;
        System.out.println("Student " + nachname + " " + name + " wurde exmatrikuliert!");
    }

    public void immatrikulieren() {
        this.exmatrikuliert = false;
        System.out.println("Student " + nachname + " " + name + " wurde immatrikuliert!");
    }

    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public String getStudentStatus() {
        if(exmatrikuliert) {
            return "exmatrikuliert";
        } else {
            return "immatrikuliert";
        }
    }

    @Override
    public String toString() {
        return matrikelNummer + "," + nachname + "," + name + "," + alter + "," + getStudentStatus();
    }
}

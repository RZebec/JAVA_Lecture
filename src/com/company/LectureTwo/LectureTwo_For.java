package com.company.LectureTwo;

public class LectureTwo_For {
    public static void main(String[] args) {
        for (int zähler = 1; zähler <= 100; zähler = zähler + 1) {
            if ((zähler % 5 == 0) && (zähler % 7 == 0)) {
                System.out.println("fizzbuzz");
            } else if (zähler % 5 == 0) {
                System.out.println("fizz");
            } else if (zähler % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(zähler);
            }
        }
    }
}

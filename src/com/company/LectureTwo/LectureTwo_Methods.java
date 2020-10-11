package com.company.LectureTwo;

import java.io.IOException;

public class LectureTwo_Methods {
    public static void main(String[] args) throws IOException {
        for (int zahl = 1; zahl <= 100; zahl++) {
            System.out.println(zahl + " hoch 2 ist " + baum(zahl));
        }
    }

    public static int baum(int x) {
        return x/2;
    }

    public static void fizzbuzz(int zahl) {
        if ((zahl % 5 == 0) && (zahl % 7 == 0)) {
            System.out.println("fizzbuzz");
        } else if (zahl % 5 == 0) {
            System.out.println("fizz");
        } else if (zahl % 7 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(zahl);
        }
    }

    public static String fizzbuzzString(int zahl) {
        if ((zahl % 5 == 0) && (zahl % 7 == 0)) {
            return "fizzbuzz";
        } else if (zahl % 5 == 0) {
            return "fizz";
        } else if (zahl % 7 == 0) {
            return "buzz";
        } else {
            return Integer.toString(zahl);
        }
    }
}

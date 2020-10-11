package com.company.LectureTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectureTwo_While {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // boolean Datentyp
        boolean wahr = true;
        wahr = 2 == 2;
        boolean falsch = 2 == 3;

        while (true) {
            System.out.print("Zahl eingeben: ");
            String input = bufferedReader.readLine();

            int zahl = Integer.parseInt(input);

            if ((zahl % 5 == 0) && (zahl % 7 == 0)) {
                System.out.println("fizzbuzz");
            } else if (zahl % 5 == 0) {
                System.out.println("fizz");
            } else if (zahl % 7 == 0) {
                System.out.println("buzz");
            }
        }
    }
}

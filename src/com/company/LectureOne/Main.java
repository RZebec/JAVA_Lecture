package com.company.LectureOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean istWahr = true;

        while (istWahr) {
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

            System.out.print("Möchtest du das Programm beenden: ");
            String uberprufung = bufferedReader.readLine();

            if (uberprufung.equals("Y")) {
                istWahr = false;
            }
        }
    }
}

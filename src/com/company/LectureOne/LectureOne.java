package com.company.LectureOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectureOne {

    public static void main(String[] args) throws IOException {
        System.out.println("Irgendwas");

        // Datentypen
        int x = 1; // ganze Zahl
        double y = 1.5; // gleitkomma
        char z = 'a'; // Zeichen
        String s = "This is a string"; //Zeichenfolge

        // Einlesen von Text
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        System.out.println("Du hast: " + input + " eingegeben.");

        int geradeZahl = Integer.parseInt(input);

        if ((geradeZahl % 2 == 0) && (geradeZahl != 0)) {
            System.out.println("Es ist eine gerade Zahl!");
        } else {
            System.out.println("Es ist eine ungerade Zahl!");
        }

        if ((geradeZahl % 5 == 0) && (geradeZahl % 7 == 0)) {
            System.out.println("fizzbuzz");
        } else if (geradeZahl % 5 == 0) {
            System.out.println("fizz");
        } else if (geradeZahl % 7 == 0) {
            System.out.println("buzz");
        }
    }
}
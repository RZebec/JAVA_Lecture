package com.company.LectureFive;

public class LectureFive_Fibonacci {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610....

        int n1 = 1;
        int n2 = 1;

        int n3;

        System.out.println(n1);
        System.out.println(n2);

        int count = 15;
        for(int i=2; i<15; i++) {

            n3 = n1 + n2;

            System.out.println(n3);

            n1 = n2;
            n2 = n3;
        }
    }
}

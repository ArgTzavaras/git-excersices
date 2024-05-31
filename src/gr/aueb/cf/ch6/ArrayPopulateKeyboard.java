package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 *  Αρχικοποιεί με Scanner από το πληκτρολόγιο
 *
 *
 */

public class ArrayPopulateKeyboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];

        for (int i = 0; i <ages.length; i++) {
            System.out.println("Δώστε αριθμό για την θέση : "+  (i+1));
            /*
             *
             */
            ages[i] = sc.nextInt();


        }

        for (int i = 0; i <ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}

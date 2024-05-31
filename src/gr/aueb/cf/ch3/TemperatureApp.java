package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;


/**
 * Αν η θερμοκρασία είναι <θ τότε isTempBelowZero
 * γίνεται true , αλλιώς γίνεται false . Ο χρήστης δίνει
 * τη θερμοκρασία
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();


        isTempBelowZero = (temp < 0);


        System.out.println("Temperature is below zero:" + isTempBelowZero);

    }
}

package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει ποιό έτος είναι
 * δίσεκτο και ποιό όχι *
 */

public class LeapYear {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputYear = 0;
        int divission4 = 0;
        int divission100 = 0;

        System.out.println(" Παρακαλώ δώστε το έτος :");
        inputYear = in.nextInt();

        divission4 = inputYear % 4;
        divission100 = inputYear % 100;

        if (divission4 == 0 && divission100 !=0 ) {
            System.out.println("Tο έτος είναι δίσεκτο .");
        } else {
            System.out.println("Το έτος δεν είναι δίσεκτο");
        }


    }
}

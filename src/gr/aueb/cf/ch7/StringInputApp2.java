package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Reads strings from the standard input
 */

public class StringInputApp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Please insert a new string that ends with enter");
        s = sc.nextLine();
        System.out.println(s);
    }
}

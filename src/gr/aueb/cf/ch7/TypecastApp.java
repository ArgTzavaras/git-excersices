package gr.aueb.cf.ch7;

import java.util.Scanner;


/**
 * Typecast from String το int . If the string
 * is not a valid int then NumberFormatException
 * is thrown
 */
public class TypecastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme;
        int num;


        System.out.println("Please insert an int :");
        lexeme = in.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is : " + num);
    }
}


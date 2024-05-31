package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Farenheit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 5;
        int f = 0;
        int y = (f-32)/9;
        int c =0;

        System.out.println("Please insert Farenheit temperatue ");
        f = in.nextInt();
        x = 5;
        y = (f-32)/9;
        c = x * y;

        System.out.printf("Celsius temperature is "+ c);

    }
}




package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MathPowers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Παρακαλώ δώστε έναν αριθμό ");
        num = sc.nextInt();

        System.out.printf("Square: %d,  Cube: %d" , (int) Math.pow(num, 2) , (int) Math.pow(num, 3));

    }
}

package gr.aueb.cf.ch5;

import java.util.Scanner;

public class TestApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Δώστε των αριθμό των αστεριών");
        n = in.nextInt();

        Horizon(n);
    }

    public static void Horizon(int n) {
        for (int i = 1 ; i <= n; i++) {
            System.out.print("*");
        }
    }

}

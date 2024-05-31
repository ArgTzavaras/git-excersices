package gr.aueb.cf.ch5;

import java.util.Scanner;
public class HomeExcercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int n = 0;
        System.out.println("Δ'ωσε ταν αριθμό από τα αστεράκια n");
        n = in.nextInt();

        do {
            printMenu();
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    Horizon(n);
                    break;
                case 2:
                    Vertical(n);
                    break;
                case 3:
                    mul(n);
                    break;
                case 4:
                    grade(n);
                    break;
                case 5:
                    reverse(n);
                    break;
                case 6:
                    System.out.println("Eπιλέξατε έξοδο");
                    break;
            }
        }while (choice !=6);
    }


    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω ");
        System.out.println("1.n οριζόντια αστεράκια ");
        System.out.println("2.n κάθετα αστεράκια ");
        System.out.println("3. n γραμμές , n στήλες");
        System.out.println("4. n γραμμές 1-n στήλες");
        System.out.println("5. n γραμμές n-1 στήλες");
        System.out.println("6. Έξοδος ");
    }

    public static void Horizon(int n) {
        for (int i = 1; i <= n ; i++) {
            System.out.print("*");
        }
    }

    public static void Vertical(int n) {
        for (int i = 1; i <= n ; i++) {
            System.out.println("*");
        }
    }

    public static void mul(int n) {
        for (int i = 1; i <= n ; i++) {
            Horizon(n);
        }
    }


    public static void grade(int n) {
        for (int i = 1; i <= n; i++) {
            Horizon(n);
        }
    }

    public static void reverse(int n) {
        for (int i = n; i >= 1; i--) {
            Horizon(n);
        }

    }


}

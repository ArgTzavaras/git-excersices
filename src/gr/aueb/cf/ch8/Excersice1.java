package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excersice1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        try {
            do {

                System.out.println("ΠΕπιλέξτε ένα από τα παρακάτω  η 5 για έξοδο");
                System.out.println("1. Εισαγωγή ");
                System.out.println("2. Αναζήτηση");
                System.out.println("3. Διαγραφή");
                System.out.println("4. Ενημέρωση");
                System.out.println("5. Εξοδος");
                choice = in.nextInt();

                if (choice == 1) {
                    System.out.println("Επιτυχής εισαγωγή");
                } else if (choice == 2) {
                    System.out.println("Επιτυχής αναζήτηδη");
                } else if (choice == 3) {
                    System.out.println("Επιτυχής διαγραφή");
                } else if (choice == 4) {
                    System.out.println("Επιτυχής ενημέρωση");
                } else if (choice == 5) {
                    System.out.println("Eπιλέξατε έξοδο");
                }
            } while (choice != 5);

            System.out.println("Good Bye");

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }



    }
}

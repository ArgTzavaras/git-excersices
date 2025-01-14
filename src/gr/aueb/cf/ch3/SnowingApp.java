package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει η όχι με βάση τη θερμοκρασία
 * αλλά και το αν βρέχει . Αν βρέχει και η θερμοκρασία
 * είναι <θ , τότε χιονίζει ,αλλιώς όχι .
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;


        System.out.println("Please insert if it is raining (true/false");
        isRaining = in.nextBoolean();
        System.out.println("Please insert temperature (int)");
        temp = in.nextInt();
        isSnowing = isRaining && (temp < 0);

        System.out.println("Is  snowing : " + isSnowing);
    }
}

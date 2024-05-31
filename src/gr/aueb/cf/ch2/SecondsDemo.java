package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecondsDemo {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputSeconds = 0;
        final int DAY = 24*3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int days = 0 , hours = 0 , minutes = 0;
        int remainingSeconds = 0;

        // Εντολές
        System.out.println("Please insert the count of seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY;
        remainingSeconds = remainingSeconds % DAY;

        minutes = remainingSeconds / MINUTE;
        remainingSeconds = remainingSeconds % MINUTE;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Input Seconds: %d = %d Days , %d Hours , %d Minutes , %d Seconds", inputSeconds , days , hours , minutes , remainingSeconds);




    }
}

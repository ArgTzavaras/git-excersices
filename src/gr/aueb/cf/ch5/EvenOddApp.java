package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 *
 *  Ορίζει τις μεθόδους isEven και isOdd
 *  για τον έλεγχο άρτιων και περιττών
 *  ακεραίων.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;

        System.out.println("Please insert an int");
        a = in.nextInt();

        System.out.printf("O %d%s είναι άρτιος" ,a,  isEven(a) ? " "  : " δεν ");
    }

    /**
     *
     * Evaluates a as even
     *
     * @param a the int to evaluate
     * @return  true if is evn , false otherwise
     *
     */

    public static boolean isEven(int a) {
        return (a % 2) == 0;
    }

    /**
     * Evaluates a as odd
     *
     * @param a    the int to evaluate
     * @return     true, if is even , false otherwise
     */

    public static boolean isOdd(int a) {
        return !isEven(a);
    }

}

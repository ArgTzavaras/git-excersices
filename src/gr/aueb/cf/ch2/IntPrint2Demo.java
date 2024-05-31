package gr.aueb.cf.ch2;

public class IntPrint2Demo {

    public static void main (String[] args) {

        int i = 10, j = 5;
        int sum = 0;

        sum = i + j;

        System.out.println("Το άθροισμα των " + i + " και " + j + " είναι : " + sum + ".");
        System.out.printf("Το άθροισμα των %d και %d είναι : %d.%n", i, j, sum);

    }
}

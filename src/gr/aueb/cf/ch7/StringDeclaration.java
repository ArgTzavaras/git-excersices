package gr.aueb.cf.ch7;

/**
 * Two types of string declaration and
 * initialization
 */

public class StringDeclaration {

    public static void main(String[] args) {
        String alice = "ALice";
        String bob = new String("Bob");

        System.out.println(alice + " and " + bob);
        System.out.println("Total length = " + (alice.length() + bob.length()));
    }
}

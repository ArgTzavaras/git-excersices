package gr.aueb.cf.ch7;

/**
 *
 *  Εκτυπώνει ένα string σε μορφή substrings
 *  ενός χαρακτήτρα την φορά
 */



public class SubstringDemo {

    public static void main(String[] args) {
        String s = "This is AUEB";


        for (int i = 0; i <s.length(); i++) {
            System.out.print(s.substring(i,i+1));
        }
    }
}

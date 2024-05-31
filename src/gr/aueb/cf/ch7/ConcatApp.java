package gr.aueb.cf.ch7;

public class ConcatApp {

    public static void main(String[] args) {
        String firstname = "Athanassios";
        String lastname = "Androutsos";
        String title = "Dr";
        String fullName1, fullName2, fullName3, fullName4;

        // + operator is overloader in Java
        // When applied to string is considered concat
        fullName1 = firstname + lastname;
        fullName2 = title + firstname + lastname;

        fullName3 = firstname.concat(lastname);
        fullName4 = title.concat(firstname).concat(lastname);  // method chain

        System.out.printf("Firstname: %s , lastname: %s ", firstname, lastname);
        System.out.printf("Full name 1 : %s ", fullName1);
        System.out.printf("Full name 2 : %s ", fullName2);
        System.out.printf("Full name 3 : %s ", fullName3);
        System.out.printf("Full name 4 : %s ", fullName4);
    }

}

package gr.aueb.ch12;

/**
 * Like a client
 *  Creates an instance (alice)
 *  Invoke public methods (setters / getters)
 */

public class StudentMain {

    public static void main(String[] args) {
        student alice = new Student();
        Student bob = new Student(2, "Bob", "D.");

        alice.setid(1);
        alice.setFirstname("alice");
        alice.setLastname("W.");

        System.out.println("Id : " + alice.getid());
        System.out.println("Firstname :" + alice.getFirstname);





        /**
        alice.id = 1;
        alice.firstname = "Alice";
        alice.lastname = "Wonderland";


        System.out.println("Id : " + alice.id);
        System.out.println("Firstname "+ alice.firstname);
        System.out.println("Lastname: " + alice.lastname);
    }
}

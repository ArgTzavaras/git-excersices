package gr.aueb.ch13.model;

public class Main {

    public static void main(String[] args) {
        Account alice = new Account(1, "GR123", "Alice", "W.", "12345", 1000.0);


        try {
            alice.deposit(1000);
            alice.withdraw(500,"12345");
            System.out.println(alice.getAccountBalance());
            System.out.println(alice.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

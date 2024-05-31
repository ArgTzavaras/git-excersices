package gr.aueb.ch13.model;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     *
     * Deposits a certain amount of money in am
     *
     * amount
     *
     *
     * @param amount
     */


    public void deposit(double amount) {
        try {
            if (amount < 0) {
                throw new Exception("Negative Amount Exception")
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }


    /**
     *  Withdraws an amounts of money from an (limk amount)
     *  based on a valid ssn     *
     *
     * @param amount
     *      the money to withdraw
     * @param ssn
     *
     * @throws Exception
     */




    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if(!this.ssn.equals(ssn)) {
                throw new Exceptiom("Ssn is not valid exception");

            }

            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }

            balance = - amount

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     *
     *
     *
     *
     *
     * @return
     */


    public double getAccountBalance() {
        return getBalance();
    }

    public String accountToString() {
        return "("+ id + ", " + iban + " , " + firstname + "   " + lastname
                + "," +ssn + " , " +  balance + ")";
    }




























































}




package Ch8Classes;


public class CharlieDoernBankAccount2 {
    private double balance;
    private String name;
    private int acctNum;
    private int ssn;
    private int pin;
    private CharlieDoernAddress address;
    private CharlieDoernDob dob;

    public CharlieDoernBankAccount2 (String name, int ssn, CharlieDoernAddress address, CharlieDoernDob dob) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
    }
    public CharlieDoernBankAccount2 (String name, int ssn, CharlieDoernAddress address, CharlieDoernDob dob, double balance, int pin) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
        this.balance = balance;
        this.pin = pin;
    }
    public String getName() {

        return name;
    }
    public CharlieDoernAddress getAddress() {

        return address;
    }
    public int getAcctNum() {
        return acctNum;
    }
    public CharlieDoernDob getDob() {
        return dob;
    }
    public void withdraw(double amount) {

        balance -= amount;
    }
    public void deposit(double cash) {

        balance += cash;
    }
    public String toString() {
        return "Name: " + name +"\nBalance:" + balance;
    }
}

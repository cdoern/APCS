package Ch8Classes;


public class CharlieDoernBankAccount {
    private double balance;
    private String name;
    private int acctNum;
    private int ssn;
    private int pin;
    private String address;
    private int dob;

    public CharlieDoernBankAccount (String name, int ssn, String address, int dob) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
    }
    public CharlieDoernBankAccount (String name, int ssn, String address, int dob, double balance, int pin) {
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
    public String getAddress() {
        return address;
    }
    public int getAcctNum() {
        return acctNum;
    }
    public int getDob() {
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

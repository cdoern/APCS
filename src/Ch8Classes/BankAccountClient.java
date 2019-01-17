package Ch8Classes;

public class BankAccountClient {
    public static void main(String[] args) {
        CharlieDoernBankAccount andrew = new CharlieDoernBankAccount("Andrew", 123456789,"123 Sesame St.", 20802);
        andrew.deposit(10000);
        System.out.println(andrew);
        andrew.withdraw(500);
        System.out.println(andrew);
        CharlieDoernBankAccount charlie = new CharlieDoernBankAccount("Charlie",123546732,"1000 W Boston Post Road", 83001, 1000000000, 1234);


    }
}

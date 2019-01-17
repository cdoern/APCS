package Ch8Classes;

public class CharlieDoernBankAccountClient {
    public static void main(String[] args) {
        CharlieDoernBankAccount2[] clients = new CharlieDoernBankAccount2[2];
        CharlieDoernBankAccount2 andrew = new CharlieDoernBankAccount2("Andrew", 123456789, new CharlieDoernAddress(123,"Sesame st.","Larchmont","NY",10538), new CharlieDoernDob(30,05,02));
        CharlieDoernBankAccount2 charlie = new CharlieDoernBankAccount2("Charlie", 143658789, new CharlieDoernAddress(345,"Random St.","Larchmont","NY",10538), new CharlieDoernDob(30,02,01));
        andrew.deposit(10000);
        System.out.println(andrew);
        andrew.withdraw(500);
        System.out.println(andrew);
        charlie.deposit(10000000);
        charlie.withdraw(2);
        System.out.println(charlie);
        clients[0] = andrew;
        clients[1] = charlie;


    }
}

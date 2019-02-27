package Ch9InheritanceP7;

public class SecretaryP7V2 extends EmployeeP7V2 {

    public SecretaryP7V2(String name, int experience) {
        super(name, experience);
    }

    public void getDictation(String text) {
        System.out.println("I can file all day..." + text);
    }
}

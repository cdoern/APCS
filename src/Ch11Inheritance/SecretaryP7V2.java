package Ch11Inheritance;

public class SecretaryP7V2 extends EmployeeP7V2 {

    public SecretaryP7V2(String name, int experience) {
        super(name, experience);
    }
    public SecretaryP7V2(String name) {
        super(name);
    }

    public void getDictation(String text) {
        System.out.println("I can file all day..." + text);
    }
}

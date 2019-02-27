package Ch11Inheritance;

public class LegalSecretaryP7V2 extends SecretaryP7V2 {

    public LegalSecretaryP7V2(String name, int experience) {
        super(name, experience);
    }
    public LegalSecretaryP7V2(String name) {
        super(name);
        //isActive = true;
    }

    public double getSalary() {
        return 45000.0;     //$45,000/year
    }
    public void getDictation(String text) {
        System.out.println("Different than secretary. " +
                "I can file all day..." + text);
    }
}

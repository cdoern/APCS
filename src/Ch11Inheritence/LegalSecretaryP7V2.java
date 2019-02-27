package Ch9InheritanceP7;

public class LegalSecretaryP7V2 extends SecretaryP7V2 {

    public LegalSecretaryP7V2(String name, int experience) {
        super(name, experience);
    }

    public double getSalary() {
        return 45000.0;     //$45,000/year
    }
    public void getDictation(String text) {
        System.out.println("Different than secretary. " +
                "I can file all day..." + text);
    }
}

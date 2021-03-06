package Ch11Inheritance;


public class MarketerP7V2 extends EmployeeP7V2 {

    public MarketerP7V2(String name, int experience) {
        super(name, experience);
    }
    public MarketerP7V2(String name) {
        super(name);
    }

    public double getSalary() {
        return 50000.0;     //$50,000/year
    }

    public void advertise() {
        System.out.println("I'll convince you to hire my law firm!");
    }
}

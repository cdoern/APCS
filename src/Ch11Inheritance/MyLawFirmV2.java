//This client program instantiates 3 objects of the type employee
//to print their salary
package Ch11Inheritance;

public class MyLawFirmV2 {
    public static void main(String[] args) {
        EmployeeP7V2[] myEmployees = {new LawyerP7V2("Gaby", 15),
                new SecretaryP7V2("Andrew", 29),
                new MarketerP7V2("Charlie", 45),
                new LegalSecretaryP7V2("Jackson", 2),
               new LegalSecretaryP7V2("Jackson")};
        printInfo(myEmployees);

    }

    public static void printInfo(EmployeeP7V2[] staff) {
        for (EmployeeP7V2 people : staff) {
            System.out.println("name: " + people.getName());
            System.out.println("exp.: " + people.getExperience());
            System.out.println("salary: " + people.getSalary());
            System.out.println("v.days: " + people.getVacationDays());
            System.out.println("v.form: " + people.getVacationForm());
            System.out.println();
        }

    }
}

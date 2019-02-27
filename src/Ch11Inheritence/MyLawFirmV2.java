//This client program instantiates 3 objects of the type employee
//to print their salary
package Ch9InheritanceP7;

public class MyLawFirmV2 {
    public static void main(String[] args) {
        EmployeeP7V2[] myEmployees = {new LawyerP7V2("Gaby", 15),
                new SecretaryP7V2("Andrew", 29),
                new MarketerP7V2("Charlie", 45),
                new LegalSecretaryP7V2("Jackson", 2)};
        printInfo(myEmployees);

    }

    public static void printInfo(EmployeeP7V2[] staff) {
        for (int i = 0; i < staff.length; i++) {
            System.out.println("name: " + staff[i].getName());
            System.out.println("exp.: " + staff[i].getExperience());
            System.out.println("salary: " + staff[i].getSalary());
            System.out.println("v.days: " + staff[i].getVacationDays());
            System.out.println("v.form: " + staff[i].getVacationForm());
            System.out.println();
        }

    }
}

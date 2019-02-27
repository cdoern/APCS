package Ch11Inheritance;

public class EmployeeP7V2 {
    private String name;
    private int experience;


    public EmployeeP7V2(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
    public EmployeeP7V2(String name) {
        this.name = name;
        this.experience = 0;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getHours() {
        return 40;  //works 40 hours/week
    }

    public double getSalary() {
        return 40000.0;     //$40,000/year
    }

    public int getVacationDays() {
        return 10;  //2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";    //use the yellow form
    }
}

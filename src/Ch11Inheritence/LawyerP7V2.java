package Ch9InheritanceP7;

public class LawyerP7V2 extends EmployeeP7V2 {
    //private boolean isActive;
    public LawyerP7V2(String name, int experience) {
        super(name, experience);
        //isActive = true;
    }
    public int getVacationDays() {
        return 15;  //3 weeks' paid vacation
    }

    public String getVacationForm() {
        return "pink";    //use the yellow form
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}

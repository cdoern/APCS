package Project6;

/**
 * the DVD class, when called, creates
 * an object of the type DVD.
 * @author Charlie Doern
 * @version 0.01
 * @since 2018-12-28
 */
public class CharlieDoernDVD {
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;

    /**
     * This is the constructor for the DVD when the "new" phrase i caled when declaring
     * a new DVD. it sets all state fileds equal to a value passed from the user.
     * @param title
     * @param director
     * @param year
     * @param cost
     * @param blueray
     */
    public CharlieDoernDVD(String title, String director, int year, double cost, boolean blueray) {
        //these next few lines are setting the state fields equal to the users passed values
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     * the overridden toString method which concatenates
     * all of the state fileds together and prints them on return
     * @return A String datatype
     */
    @Override
    public String toString() {
        //if the blueray boolean is true string them together with blu ray at the end
    if(blueray){
  return(" $"+cost+" "+year+" "+title+" "+director+"    Blu-Ray");
    }
    //if no blue ray then just print normally
    return("$"+cost+" "+year+" "+title+" "+director+"    ");
}

}

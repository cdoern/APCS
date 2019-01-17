package Project6;

/**
 * The DVDCollection class takes user input from a client program, and creates an object of the type
 * DVD and adds it to an array of DVD's which can easily be printed out for viewing.
 *
 * @author Charlie Doern
 * @version 0.01
 * @since 2018-12-28
 */
public class CharlieDoernDVDCollection {
    private CharlieDoernDVD[] dvdlist = new CharlieDoernDVD[1];
    private int count = 0;
    private double totalCost;

    /**
     * Creates an object of the type DVD and adds it to the list (the array of the type DVD)
     * @param title
     * @param director
     * @param year
     * @param cost
     * @param blueray
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray){
        CharlieDoernDVD temp = new CharlieDoernDVD(title,director,year,cost,blueray); // new DVD obj declared
        totalCost+=cost; //increasing the total cost
     //   System.out.println(dvdlist.length);
     //   System.out.println(count);
        if(dvdlist.length > count) { //if there is more room in the array just add it
            dvdlist[count] = temp;
        }
        else if(count <= dvdlist.length){ //if there is not  enough room call the increase size method and then when done add it to the array
            increasesize();
            dvdlist[count] = temp;
        }
        count++; //increase the total amount by 1
        }

    /**
     * This is a void method which increases the size
     * if the dvdlist array if the array can no longer fit
     * a new DVD within it
     */
    public void increasesize(){
        int len = dvdlist.length + 1; //the new length of the array
        CharlieDoernDVD[] tempar = new CharlieDoernDVD[len]; //temp array to add the values to
        for(int i = 0; i <dvdlist.length; i++){
            tempar[i] = dvdlist[i]; //add values to temp array
        }
        dvdlist = tempar; //set the real array equal to the larger one
        }

    /**
     * This is the overridden toString method
     * this method creates the easily readable printed out contents of the DVD list and includes extra
     * information sucbh as "averageprice"
     * @return A String datatype
     */
    @Override
    public String toString() {
        //the next few lines are just creating and frmatting the first part of the string to be printed out with proper spacing
        String str = (" My DVD Collection \n \n" +
        "" +
        " Number of DVDs: "+ dvdlist.length +
        "\n Total cost: "+totalCost+
        "\n Average cost: "+(Math.round((totalCost/count)*100.0)/100.0)+

        "\n \n DVD List:");
        String str2 ="";
        for(int i = 0; i<dvdlist.length; i++) { //this for loop gets each DVD entry in the array and adds it to a string
            str2+=dvdlist[i]+"\n ";
        }
        str+="\n \n" +str2; //concatenate the strings
        return str; //return one string
    }
    }


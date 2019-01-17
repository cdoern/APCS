package Ch8Classes;
import java.util.*;
public class CharlieDoernGroceryList {
    //declaring the state fields
    private int numItems = 0;
    private CharlieDoernGroceryItem[] items = new CharlieDoernGroceryItem[11]; //an array of objects (grocery items)

    //empty constructor
    public CharlieDoernGroceryList(){
    }

    //adds an item to the list
    public void addItem(CharlieDoernGroceryItem item){
       items[numItems] = item; //adding to array
        numItems++; //increasing the total number of items

    }

    //retrievees the total cost of the list
    public double getTotalCost(){
        double cost = 0.0;

        for(int i = 0; i < numItems;i++){//goes through the array and adds the cost of each item to a double
            double temp = items[i].getPrice();
            cost+=temp;
        }
        return cost;
    }

    //the overidden toString method which returns the proper data
    @Override
    public String toString() {
        int num = numItems;
        CharlieDoernGroceryItem[] newItems = new CharlieDoernGroceryItem[num]; //making a new array that does not contain any "null"
        for(int i = 0; i < newItems.length; i++){
            newItems[i] = items[i]; //adding items to new array

        }
        return "CharlieDoernGroceryList{" + //returning the proper string
                "numItems=" + numItems +
                ", items=" + Arrays.toString(newItems) +
                '}';
    }
}

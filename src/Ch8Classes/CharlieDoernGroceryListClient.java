package Ch8Classes;

public class CharlieDoernGroceryListClient {
    public static void main(String[] args){
        CharlieDoernGroceryList list = new CharlieDoernGroceryList(); //declaring the new list object
        list.addItem(new CharlieDoernGroceryItem("lettuce",2,20.00)); //manipulating it by adding a value
        System.out.println(list); //printing
        System.out.println(list.getTotalCost()); //printing total cost
        list.addItem(new CharlieDoernGroceryItem("tomatoes", 5, 18.00)); //repeating the above steps
        System.out.println(list);
        System.out.println(list.getTotalCost());

    }
}

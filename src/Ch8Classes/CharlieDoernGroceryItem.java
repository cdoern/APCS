package Ch8Classes;

public class CharlieDoernGroceryItem {
    //declaring state fields
    private String name;
    private int quantity;
    private double price;

    public CharlieDoernGroceryItem(String name, int quantity, double price) { //constructor which sets state fields equal to the information passed from client
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    //next 2 methods are "getters" which simply just retrieve and print the information
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    //sets the quantity to the passed value
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//retrieves the price of the item
    public double getPrice() {
        return price;
    }

    //overridden toString method which is implicitly called and prints out the data
    @Override
    public String toString() {
        return "CharlieDoernGroceryItemOrder{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}

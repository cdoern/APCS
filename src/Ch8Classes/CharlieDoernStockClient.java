package Ch8Classes;

public class CharlieDoernStockClient {
    public static void main(String[] args) {
        CharlieDoernStock mystock = new CharlieDoernStock("Googl");
        mystock.setTotalCost(100000.00);
        mystock.setSymbol("Appl");
        mystock.buy(12,2000.00);
        System.out.println(mystock);


    }
}

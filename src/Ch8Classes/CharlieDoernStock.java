package Ch8Classes;

public class CharlieDoernStock {
    private String symbol;
    private double totalCost;
    private int shared;
    public CharlieDoernStock(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol() {
        return symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }
    public double profit(double moneyin){
       return(totalCost - moneyin);

    }

    public int getShared() {
        return shared;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setShared(int shared) {
        this.shared = shared;
    }
    public void buy(int shares, double value){
        this.totalCost -= value;
        this.shared+=shares;
    }
    @Override
    public String toString() {
        return "CharlieDoernStock{" +
                "symbol='" + symbol + '\'' +
                ", totalCost=" + totalCost +
                ", shared=" + shared +
                '}';
    }



}

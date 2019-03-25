package Ch9Inheritance;

public abstract class ShareAsset implements Asset{
    private String symbol;
    private double totalCost, currentPrice;

    public ShareAsset(String symbol, double currentPrice){
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }
    public double getTotalCost(){
        return totalCost;
    }

    public abstract double getMarketValue();

    public double getProfit(){
        return getMarketValue() - totalCost;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    public void addCost (double cost){
        this.totalCost += cost;
    }
}

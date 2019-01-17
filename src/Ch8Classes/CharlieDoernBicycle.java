package Ch8Classes;

public class CharlieDoernBicycle {
    private double price;
    private boolean isPurchased;
    private String condition;
    private double psi;
    private int wheels;
    private int numGears;
    private int ageRange;
    private String color;
    private double rpm;
    private boolean isBraking;
    private boolean isInMotion;

    public CharlieDoernBicycle(double price, boolean isPurchased, String condition, int numGears, int ageRange, String color) {
        this.price = price;
        this.isPurchased = isPurchased;
        this.condition = condition;
        this.numGears = numGears;
        this.ageRange = ageRange;
        this.color = color;
    }

    public CharlieDoernBicycle(double price, boolean isPurchased, String condition, int ageRange, String color) {
        this.price = price;
        this.isPurchased = isPurchased;
        this.condition = condition;
        this.ageRange = ageRange;
        this.color = color;
    }
    public double getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public String getCondition() {
        return condition;
    }

    public double getPsi() {
        return psi;
    }

    public int getWheels() {
        return wheels;
    }

    public int getNumGears() {
        return numGears;
    }

    public int getAgeRange() {
        return ageRange;
    }

    public String getColor() {
        return color;
    }

    public double getRpm() {
        return rpm;
    }

    public boolean isBraking() {
        return isBraking;
    }

    public boolean isInMotion() {
        return isInMotion;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setPsi(double psi) {
        this.psi = psi;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Bicycle{" +
                "price=" + price +
                ", isPurchased=" + isPurchased +
                ", condition='" + condition + '\'' +
                ", psi=" + psi +
                ", wheels=" + wheels +
                ", numGears=" + numGears +
                ", ageRange=" + ageRange +
                ", color='" + color + '\'' +
                ", rpm=" + rpm +
                ", isBraking=" + isBraking +
                ", isInMotion=" + isInMotion +
                '}';
    }

}

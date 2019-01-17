package Ch8Classes;

public class CharlieDoernlightbulb {
    private boolean onoff;
    private String color;
    private int wattage;
    private char size;
    private double temp;

    public CharlieDoernlightbulb(boolean onoff, String color, int wattage, char size, double temp) {
        this.onoff = onoff;
        this.color = color;
        this.wattage = wattage;
        this.size = size;
        this.temp = temp;
    }

    public boolean isOnoff() {
        return onoff;
    }

    public String getColor() {
        return color;
    }

    public int getWattage() {
        return wattage;
    }

    public char getSize() {
        return size;
    }
    public void setOnoff(boolean onoff) {
        this.onoff = onoff;
    }
    public double getTemp() {
        return temp;
    }

}



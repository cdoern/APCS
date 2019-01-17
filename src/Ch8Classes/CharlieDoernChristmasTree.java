package Ch8Classes;

public class CharlieDoernChristmasTree {
    private boolean alive;
    private int ornaments;
    private boolean tinsil;
    private int height;
    private boolean lightsOn;
    private int candyCanes;
    private String topper;

    public CharlieDoernChristmasTree(boolean alive, int height) {
        this.alive = alive;
        this.height = height;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getOrnaments() {
        return ornaments;
    }

    public boolean isTinsil() {
        return tinsil;
    }

    public int getHeight() {
        return height;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public int getCandyCanes() {
        return candyCanes;
    }

    public String getTopper() {
        return topper;
    }

    public void setTinsil(boolean tinsil) {
        this.tinsil = tinsil;
    }

    public void setOrnaments(int ornaments) {
        this.ornaments = ornaments;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public void setCandyCanes(int candyCanes) {
        this.candyCanes = candyCanes;
    }

    public void setTopper(String topper) {
        this.topper = topper;
    }
    @Override
    public String toString() {
        return "ChristmasTree{" +
                "alive=" + alive +
                ", ornaments=" + ornaments +
                ", tinsil=" + tinsil +
                ", height=" + height +
                ", lightsOn=" + lightsOn +
                ", candyCanes=" + candyCanes +
                ", topper='" + topper + '\'' +
                '}';
    }
}
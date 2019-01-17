package Ch8Classes;

public class CharlieDoernDob {
    private final int day;
    private final int month;
    private final int year;
    public CharlieDoernDob(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "CharlieDoernDob{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

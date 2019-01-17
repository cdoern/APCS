package Ch8Classes;

public class CharlieDoernAddress {
    private int houseNum;
    private String aptNum;
    private String street;
    private String city;
    private String state;
    private int zipCode;

    public CharlieDoernAddress(String aptNum, String street, String city, String state, int zipCode) {
        this.aptNum = aptNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public CharlieDoernAddress(int houseNum, String street, String city, String state, int zipCode) {
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return "CharlieDoernAddress{" +
                "houseNum=" + houseNum +
                ", aptNum='" + aptNum + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

}

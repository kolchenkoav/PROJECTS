package javaunittest;

import java.util.ArrayList;

public class Car {
    private String manufactorer;
    private String number;
    private int year;
    private String owher;
    private ArrayList<String> owners = new ArrayList<>();

    public Car(String manufactorer, String number, int year, String owher) {
        this.manufactorer = manufactorer;
        this.number = number;
        this.year = year;
        this.owher = owher;
        owners.add(owher);
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public String getOwher() {
        return owher;
    }

    public void setOwher(String owher) {
        this.owher = owher;
        owners.add(owher);
    }
    public ArrayList<String> getOwners() {
        return owners;
    }

    private String testMethod() {
        return "ABS";
    }

    private String testMethod(String a) {
        return a;
    }
}

package web.models;

import java.util.List;

public class Car {
    private int yearOfRelease;
    private String model;
    private String color;



    public Car(int yearOfRelease, String model, String color) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.color = color;
    }


    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfRelease=" + yearOfRelease +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

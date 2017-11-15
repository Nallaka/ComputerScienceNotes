package me.nallaka.OOPDemo;

public class Car{
    //global variables: Make, Model, Year, Color
    private String make, model, color;
    private int year;
//default constructor
    public Car() {
        this.make = "Toyota";
        this.model = "Camry";
        this.year = 2015;
        this.color = "Blue";
    }
//Constructor that takes in values for all 4 variables at once
    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

//mutators for all

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

//accessors for all

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

//toString()

    @Override
    public String toString() {
        return "Car:\n" +
                "The make is " + make + '\n' +
                "The model is " + model + '\n' +
                "The color is " + color + '\n' +
                "The year is " + year;
    }

//Honk method that prints out some honking noise
    public void honk() {
        System.out.println("HONK!");
    }
//compareTo returns the difference in years of two Car objects (make sure to comment so the
    //result makes sense)
    //if negative, car is older than other
    //if positive, car is younger than other
    //if same, cars are the same age
    public int compareTo(Car other) {
        return this.getYear() - other.getYear();
    }
}
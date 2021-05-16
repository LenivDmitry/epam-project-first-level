package com.epam.elearn.java_classes.entity;

import com.epam.elearn.java_classes.enums.BrandCar;
import com.epam.elearn.java_classes.enums.ModelCar;

public class Car {
    private int id;
    private BrandCar brand;
    private ModelCar model;
    private int yearOfIssue;
    private String color;
    private double cost;
    private String registrationNumber;


    public Car() {
    }

    public Car(BrandCar brand, ModelCar model, int yearOfIssue, String color, double cost, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.cost = cost;
        this.registrationNumber = registrationNumber;
    }

    public Car(int id, BrandCar brand, ModelCar model, int yearOfIssue, String color, double cost, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.cost = cost;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BrandCar getBrand() {
        return brand;
    }

    public void setBrand(BrandCar brand) {
        this.brand = brand;
    }

    public ModelCar getModel() {
        return model;
    }

    public void setModel(ModelCar model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "brand - " + brand +
                ", model - " + model +
                ", yearOfIssue - " + yearOfIssue +
                ", color - " + color +
                ", cost - " + cost +
                ", registrationNumber - " + registrationNumber;
    }
}

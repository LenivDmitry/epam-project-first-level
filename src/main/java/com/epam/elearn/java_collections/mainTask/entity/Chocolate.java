package com.epam.elearn.java_collections.mainTask.entity;

import com.epam.elearn.java_collections.mainTask.enums.ChocolateType;

public class Chocolate extends Sweetness {
    private double costPerHundredGrams;
    private ChocolateType chocolateType;

    public Chocolate(double costPerHundredGrams, ChocolateType chocolateType, double weight,
                     double caloriesPerHundredGrams, double sugarContentPerHundredGrams) {
        super(weight, caloriesPerHundredGrams, sugarContentPerHundredGrams);
        this.costPerHundredGrams = costPerHundredGrams;
        this.chocolateType = chocolateType;
    }

    public double getCostPerHundredGrams() {
        return costPerHundredGrams;
    }

    public void setCostPerHundredGrams(double costPerHundredGrams) {
        this.costPerHundredGrams = costPerHundredGrams;
    }

    public ChocolateType getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public double commonCost() {
        int convertToKilogram = 100;
        return getWeight() / convertToKilogram * costPerHundredGrams;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "costPerHundredGrams=" + costPerHundredGrams +
                ", chocolateType=" + chocolateType +
                ", " + super.toString() +
                '}';
    }
}

package com.epam.elearn.javaCollections.mainTask.entity;

public abstract class Sweetness {
    private double caloriesPerHundredGrams;
    private double weight;
    private double sugarContentPerHundredGrams;

    public Sweetness(double weight, double caloriesPerHundredGrams, double sugarContentPerHundredGrams) {
        this.weight = weight;
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
        this.sugarContentPerHundredGrams = sugarContentPerHundredGrams;
    }

    public Sweetness() {
    }

    public double getCaloriesPerHundredGrams() {
        return caloriesPerHundredGrams;
    }

    public void setCaloriesPerHundredGrams(double caloriesPerHundredGrams) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarContentPerHundredGrams() {
        return sugarContentPerHundredGrams;
    }

    public void setSugarContentPerHundredGrams(double sugarContentPerHundredGrams) {
        this.sugarContentPerHundredGrams = sugarContentPerHundredGrams;
    }

    public abstract double commonCost();

    @Override
    public String toString() {
        return "Sweetness{" +
                "caloriesPerHundredGrams=" + caloriesPerHundredGrams +
                ", weight=" + weight +
                ", sugarContentPerHundredGrams=" + sugarContentPerHundredGrams +
                '}';
    }
}

package com.epam.elearn.java_collections.mainTask.entity;

public class Candie extends Sweetness {
    private String name;
    private double costPerOnePiece;
    private int quantity;

    public Candie(String name, double costPerOnePiece, int quantity,
                  double weight, double caloriesPerHundredGrams, double sugarContentPerHundredGrams) {
        super(weight, caloriesPerHundredGrams, sugarContentPerHundredGrams);
        this.name = name;
        this.costPerOnePiece = costPerOnePiece;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerOnePiece() {
        return costPerOnePiece;
    }

    public void setCostPerOnePiece(double costPerOnePiece) {
        this.costPerOnePiece = costPerOnePiece;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double commonCost() {
        return quantity * costPerOnePiece;
    }

    @Override
    public String toString() {
        return "Candie{" +
                "name='" + name + '\'' +
                ", costPerOnePiece=" + costPerOnePiece +
                ", quantity=" + quantity +
                ", " + super.toString() +
                '}';
    }
}

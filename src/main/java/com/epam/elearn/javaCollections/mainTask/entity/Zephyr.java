package com.epam.elearn.javaCollections.mainTask.entity;

public class Zephyr extends Sweetness {
    private double costPerOnePiece;
    private int quantity;

    public Zephyr(double costPerOnePiece, int quantity, double weight,
                  double caloriesPerHundredGrams, double sugarContentPerHundredGrams) {
        super(weight, caloriesPerHundredGrams, sugarContentPerHundredGrams);
        this.costPerOnePiece = costPerOnePiece;
        this.quantity = quantity;
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
        return "Zephyr{" +
                "costPerOnePiece=" + costPerOnePiece +
                ", quantity=" + quantity +
                ", " + super.toString() +
                '}';
    }
}

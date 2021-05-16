package com.epam.elearn.java_classes;

import com.epam.elearn.java_classes.service.CarService;

public class Runner {
    public static void main(String[] args) {
        CarService carService = new CarService();
        String givenBrand = "BMW";
        String givenModel = "compartment";
        int numberYearOfOperation = 5;
        int yearOfIssue = 2015;
        double cost = 55500;

        carService.allCarsByBrand(givenBrand);
        carService.allCarsByModelAndOperation(givenModel, numberYearOfOperation);
        carService.allCarsByYearOfIssueMoreThenGivenCost(yearOfIssue, cost);
    }
}

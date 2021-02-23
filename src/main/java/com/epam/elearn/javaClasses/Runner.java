package com.epam.elearn.javaClasses;

import com.epam.elearn.javaClasses.service.CarService;

import java.util.Calendar;
import java.util.Date;

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

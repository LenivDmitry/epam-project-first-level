package com.epam.elearn.javaClasses.service;

import com.epam.elearn.javaClasses.entity.Car;
import com.epam.elearn.javaClasses.enums.BrandCar;
import com.epam.elearn.javaClasses.enums.ModelCar;

import java.util.Calendar;

public class CarService {
    private static Car[] cars = new Car[10];

    static {
        cars[0] = new Car(1, BrandCar.BMW, ModelCar.SEDAN, 2011, "black", 42000, "8394ax-1");
        cars[1] = new Car(2, BrandCar.HONDA, ModelCar.COMPARTMENT, 2015, "grey", 55000, "9823AO-2");
        cars[2] = new Car(3, BrandCar.AUDI, ModelCar.SEDAN, 2018, "white", 72000, "9472BA-3");
        cars[3] = new Car(4, BrandCar.BMW, ModelCar.COMPARTMENT, 2011, "black", 43000, "9301BO-4");
        cars[4] = new Car(5, BrandCar.HONDA, ModelCar.SEDAN, 2015, "grey", 56000, "7352BX-5");
        cars[5] = new Car(6, BrandCar.AUDI, ModelCar.COMPARTMENT, 2018, "white", 73000, "3926AX-6");
        cars[6] = new Car(7, BrandCar.BMW, ModelCar.SEDAN, 2011, "black", 44000, "7511AO-7");
        cars[7] = new Car(8, BrandCar.HONDA, ModelCar.COMPARTMENT, 2015, "grey", 57000, "9001AX-2");
        cars[8] = new Car(9, BrandCar.AUDI, ModelCar.SEDAN, 2018, "white", 74000, "2534BA-3");
        cars[9] = new Car(10, BrandCar.BMW, ModelCar.COMPARTMENT, 2019, "blue", 80000, "7733BO-4");
    }

    public void allCarsByBrand(String brand) {
        try {
            brand = brand.toUpperCase().trim().replaceAll(" ", "");
            BrandCar brandCar = BrandCar.valueOf(brand);
            System.out.println("The BMW car list:");
            for (Car car : cars) {
                if (car.getBrand().equals(brandCar)) {
                    System.out.println(car);
                }
            }
        } catch (EnumConstantNotPresentException e) {
            System.out.println("There is no such brand");
        }
    }

    public void allCarsByModelAndOperation(String model, int numberYearOfOperation) {
        try {
            model = model.toUpperCase().trim().replaceAll(" ", "");
            ModelCar modelCar = ModelCar.valueOf(model);
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int maxYearWithNeededOperation = currentYear - numberYearOfOperation;
            System.out.println("The " + model + " car list which operation more then " + numberYearOfOperation + " years:");
            for (Car car : cars) {
                if (car.getModel().equals(modelCar) && car.getYearOfIssue() < maxYearWithNeededOperation) {
                    System.out.println(car);
                }
            }
        } catch (EnumConstantNotPresentException e) {
            System.out.println("There is no such model");
        }
    }

    public void allCarsByYearOfIssueMoreThenGivenCost(int yearOfIssue, double cost) {
        System.out.println("The car list which have " + yearOfIssue + " year of issue and cost more then " + cost + ":");
        for (Car car : cars) {
            if (car.getYearOfIssue() == yearOfIssue && car.getCost() > cost) {
                System.out.println(car);
            }
        }

    }

}

package com.epam.elearn.java_collections.mainTask.service;

import com.epam.elearn.java_collections.mainTask.api.services.GiftService;
import com.epam.elearn.java_collections.mainTask.entity.Candie;
import com.epam.elearn.java_collections.mainTask.entity.Chocolate;
import com.epam.elearn.java_collections.mainTask.entity.Sweetness;
import com.epam.elearn.java_collections.mainTask.entity.Zephyr;
import com.epam.elearn.java_collections.mainTask.enums.ChocolateType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GiftServiceImpl implements GiftService {
    @Override
    public List<Sweetness> addCandies(List<Sweetness> sweetness) {
        Sweetness candieNuts = new Candie("Nuts", 3, 4,
                15, 78, 10);
        Sweetness candieCow = new Candie("Сow", 4, 2,
                20, 106, 23);
        Sweetness candieChupaChups = new Candie("Chupa Chups", 7, 3,
                25, 42, 17);

        sweetness.add(candieNuts);
        sweetness.add(candieCow);
        sweetness.add(candieChupaChups);

        return sweetness;
    }

    @Override
    public List<Sweetness> addChocolate(List<Sweetness> sweetness) {
        Sweetness chocolateWhite = new Chocolate(3, ChocolateType.WHITE, 250,
                320, 72);

        sweetness.add(chocolateWhite);
        return sweetness;
    }

    @Override
    public List<Sweetness> addZephyr(List<Sweetness> sweetness) {
        Sweetness zephyr = new Zephyr(3, 2, 70,
                120, 32);

        sweetness.add(zephyr);
        return sweetness;
    }

    @Override
    public double countGiftWeight(List<Sweetness> sweetness) {
        double commonWeight = 0;
        for (Sweetness object : sweetness) {
            commonWeight += object.getWeight();
        }
        return commonWeight;
    }

    @Override
    public List<Sweetness> sortByWeight(List<Sweetness> sweetness) {
        Collections.sort(sweetness, Comparator.comparingDouble(Sweetness::getWeight));
        return sweetness;
    }

    @Override
    public List<Sweetness> getSweetnessInGivenSugarDiapason(List<Sweetness> sweetness,
                                                            double lowerParam, double upperParam) {
        List<Sweetness> sweetnessInDiapason = new ArrayList<>();
        if (lowerParam <= upperParam) {
            for (Sweetness object : sweetness) {
                if (object.getSugarContentPerHundredGrams() >= lowerParam &&
                        object.getSugarContentPerHundredGrams() <= upperParam) {
                    sweetnessInDiapason.add(object);
                }
            }
            return sweetnessInDiapason;
        } else {
            System.out.println("parameters are incorrect");
        }
        return sweetnessInDiapason;
    }
}

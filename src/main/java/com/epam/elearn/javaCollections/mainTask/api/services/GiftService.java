package com.epam.elearn.javaCollections.mainTask.api.services;

import com.epam.elearn.javaCollections.mainTask.entity.Sweetness;

import java.util.List;

public interface GiftService {
    public List<Sweetness> addCandies(List<Sweetness> sweetness);

    public List<Sweetness> addChocolate(List<Sweetness> sweetness);

    public List<Sweetness> addZephyr(List<Sweetness> sweetness);

    public double countGiftWeight(List<Sweetness> sweetness);

    public List<Sweetness> sortByWeight(List<Sweetness> sweetness);

    public List<Sweetness> getSweetnessInGivenSugarDiapason(List<Sweetness> sweetness,
                                                            double firstParam, double secondParam);
}

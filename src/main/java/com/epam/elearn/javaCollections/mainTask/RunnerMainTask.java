package com.epam.elearn.javaCollections.mainTask;

import com.epam.elearn.javaCollections.mainTask.entity.Gift;

public class RunnerMainTask {
    public static void main(String[] args) {
        Gift gift = new Gift("Sugar boom");
        gift.setGiftContent(gift.getGiftServiceImpl().addCandies(gift.getGiftContent()));
        gift.setGiftContent(gift.getGiftServiceImpl().addChocolate(gift.getGiftContent()));
        gift.setGiftContent(gift.getGiftServiceImpl().addZephyr(gift.getGiftContent()));

        System.out.println(gift.getGiftServiceImpl()
                .getSweetnessInGivenSugarDiapason(gift.getGiftContent(),9,20));
    }
}

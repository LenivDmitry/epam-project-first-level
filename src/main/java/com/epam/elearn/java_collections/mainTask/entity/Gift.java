package com.epam.elearn.java_collections.mainTask.entity;

import com.epam.elearn.java_collections.mainTask.service.GiftServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private String name;
    private List<Sweetness> giftContent = new ArrayList<>();
    private GiftServiceImpl giftServiceImpl = new GiftServiceImpl();

    public Gift(String name) {
        this.name = name;
    }

    public GiftServiceImpl getGiftServiceImpl() {
        return giftServiceImpl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sweetness> getGiftContent() {
        return giftContent;
    }

    public void setGiftContent(List<Sweetness> giftContent) {
        this.giftContent = giftContent;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", giftContent=" + giftContent +
                '}';
    }
}

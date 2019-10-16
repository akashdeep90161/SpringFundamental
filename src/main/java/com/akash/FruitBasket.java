package com.akash;

import java.util.List;

public class FruitBasket {
 // It will explain setting list property
    private String name;
    private List<String> fruits;

    public FruitBasket(String name, List<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "FruitBasket{" +
                "name='" + name + '\'' +
                ", fruits=" + fruits +
                '}';
    }
}

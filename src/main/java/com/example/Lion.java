package com.example;

import java.util.List;

public class Lion {
    private FeelineInterface feelineInterface;
    private AnimalInterface animalInterface;

    boolean hasMane;

    public Lion(String sex, FeelineInterface feelineInterface, AnimalInterface animalInterface) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.feelineInterface = feelineInterface;
        this.animalInterface = animalInterface;
    }

    public int getKittens() {
        return feelineInterface.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animalInterface.getFood("Хищник");
    }
}

package com.example;

import java.util.List;

public class Feline implements Predator, FeelineInterface{
    private Animal animal;

    public Feline(Animal animal) {
        this.animal = animal;
    }


    @Override
    public List<String> eatMeat() throws Exception {
        return animal.getFood("Хищник");
    }


    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}

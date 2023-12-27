package com.example;

import java.util.List;

public class Cat {

    private Predator predator;
    private Feline feline;

    public Cat(Feline feline) {
        this.feline = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }

}

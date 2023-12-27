package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest{

    @Test
    public void testGetFood() {
        //TODO: need Mock and DI + Parameters

    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String actualName = animal.getFamily();
        String expectedName = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedName, actualName);
    }
}
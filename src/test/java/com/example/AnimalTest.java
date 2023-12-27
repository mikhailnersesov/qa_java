package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest{

    @Test
    public void testGetFood() {
        //TODO: need Mock and DI
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String actualName = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actualName);
    }
}
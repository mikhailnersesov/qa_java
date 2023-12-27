package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalTest {

    @Test(expected = Exception.class)
    public void testGetFoodThirdGender() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Неизвестный вид");
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String actualFamilyName = animal.getFamily();
        String expectedFamilyName = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedFamilyName, actualFamilyName);
    }
}
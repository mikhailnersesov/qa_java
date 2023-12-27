package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class AnimalTest{

    @Test(expected=Exception.class)
    public void testGetFoodThirdGender() throws Exception {
        //TODO: need Mock and DI + Parameters
        Animal animal = new Animal();
        animal.getFood("Неизвестный вид");
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String actualName = animal.getFamily();
        String expectedName = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedName, actualName);
    }
}
package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest{

    @Test
    public void testGetFoodGrassFeeding() throws Exception {
        //TODO: need Mock and DI + Parameters
        Animal animal = new Animal();
        List<String> expectedFood = Arrays.asList("Трава", "Различные растения");
        List<String> actualFood = animal.getFood("Травоядное");
        assertEquals(expectedFood, actualFood);
    }
    @Test
    public void testGetFoodPredator() throws Exception {
        //TODO: need Mock and DI + Parameters
        Animal animal = new Animal();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = animal.getFood("Хищник");
        assertEquals(expectedFood, actualFood);
    }
    @Test(expected=Exception.class)
    public void testGetFoodThirdGender() throws Exception {
        //TODO: need Mock and DI + Parameters
        Animal animal = new Animal();
        animal.getFood("Третий пол");
    }


    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String actualName = animal.getFamily();
        String expectedName = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedName, actualName);
    }
}
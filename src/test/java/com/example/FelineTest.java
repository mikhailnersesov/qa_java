package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest{
    @Mock
    Animal animal;
    @Mock
    Feline feline;

    @Test
    public void shouldFelineEatMeatThenGetFoodPositive() throws Exception {
        //TODO: no mocks, max spy
        Feline feline = new Feline(animal);
        List<String> expectedEatMeatName = Arrays.asList("Животные", "Птицы", "Рыба");
        //TODO: parameterized for Травоядное
        when(animal.getFood("Хищник")).thenReturn(expectedEatMeatName);
        List<String>  actualEatMeatName =  feline.eatMeat();
        assertEquals(expectedEatMeatName, actualEatMeatName);
    }

    @Test
    public void testGetFamily() {
        String expectedFamilyName = "Кошачьи";
        Feline feline = new Feline();
        String actualFamilyName = feline.getFamily();
        assertEquals(expectedFamilyName, actualFamilyName);
    }

    @Test
    public void testGetKittens() {
        int expectedFamilyName = 1;
        Feline feline = new Feline();
        int actualFamilyName = feline.getKittens(1);
        assertEquals(expectedFamilyName, actualFamilyName);
    }

    @Test
    public void testTestGetKittens() {
        int expectedFood = 1;
        Feline feline = new Feline();
        int actualFood = feline.getKittens();
        assertEquals(expectedFood, actualFood);
    }
}
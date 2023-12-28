package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Mock
    private Animal animal;

    @Test
    public void eatFoodPredatorFoodListShowsOk() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(animal.getFood("Хищник")).thenReturn(expectedFoodList);
        List<String> actualFoodList = feline.eatMeat();
        assertEquals(expectedFoodList, actualFoodList);
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
        int expectedKittensNumber = 1;
        Feline feline = new Feline();
        int actualKittensNumber = feline.getKittens(1);
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }

    @Test
    public void testTestGetKittens() {
        int expectedKittensNumber = 1;
        Feline feline = new Feline();
        int actualKittensNumber = feline.getKittens();
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }
}
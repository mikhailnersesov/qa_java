package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeatPredatorFoodListShowsOk() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = feline.eatMeat();
        assertEquals(expectedFoodList, actualFoodList);
    }

    @Test
    public void getFamilyCatsShowsOk() {
        String expectedFamilyName = "Кошачьи";
        Feline feline = new Feline();
        String actualFamilyName = feline.getFamily();
        assertEquals(expectedFamilyName, actualFamilyName);
    }

    @Test
    public void getKittensForFiveKittensShowsOk() {
        int expectedKittensNumber = 5;
        Feline feline = new Feline();
        int actualKittensNumber = feline.getKittens(5);
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }

    @Test
    public void getKittensForOneKittenShowsOk() {
        int expectedKittensNumber = 1;
        Feline feline = new Feline();
        int actualKittensNumber = feline.getKittens();
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }
}
package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    Animal animal;
    @Mock
    Feline feline;


    @Test
    public void testGetKittens() {
        Lion lion = new Lion(feline, animal);
        int expectedKittensNumber = 3;
        when(feline.getKittens()).thenReturn(expectedKittensNumber);
        int actualKittensNumber = lion.getKittens();
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }


    @Test
    public void testGetFoodMale() throws Exception {
        Lion lion = new Lion("Самец", feline, animal);
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        when(animal.getFood("Хищник")).thenReturn(expectedFoodList);
        List<String> actualFoodList = lion.getFood();
        assertEquals(expectedFoodList, actualFoodList);
    }

    @Test
    public void testGetFoodFemale() throws Exception {
        Lion lion = new Lion("Самка", feline, animal);
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        when(animal.getFood("Хищник")).thenReturn(expectedFoodList);
        List<String> actualFoodList = lion.getFood();
        assertEquals(expectedFoodList, actualFoodList);
    }

    @Test(expected = Exception.class)
    public void testGetFoodThirdGender() throws Exception {
        Lion lion = new Lion("Третий пол", feline, animal);
    }

    @Test(expected = Exception.class)
    public void testGetFoodThirdGender2() throws Exception {
        Lion lion = new Lion("Третий пол");
    }

}
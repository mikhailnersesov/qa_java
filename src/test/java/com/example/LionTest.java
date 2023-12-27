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
        int expectedFood = 3;
        when(feline.getKittens()).thenReturn(expectedFood);
        int actualFood = lion.getKittens();
        assertEquals(expectedFood, actualFood);
    }


    @Test
    public void testGetFoodMale() throws Exception {
        Lion lion = new Lion("Самец", feline, animal);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(animal.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFoodFemale() throws Exception {
        Lion lion = new Lion("Самка", feline, animal);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(animal.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
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
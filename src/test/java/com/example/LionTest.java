package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
    Feline feline;


    @Test
    public void getKittensForMaleWithThreeChildrenShowsOk() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedKittensNumber = 3;
        when(feline.getKittens()).thenReturn(expectedKittensNumber);
        int actualKittensNumber = lion.getKittens();
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }


    @Test
    public void getFoodForMaleWithListOfFoodShowsOk() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFoodList);
        List<String> actualFoodList = lion.getFood();
        assertEquals(expectedFoodList, actualFoodList);
    }

    @Test
    public void getFoodForFemaleWithListOfFoodShowsOk() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFoodList);
        List<String> actualFoodList = lion.getFood();
        assertEquals(expectedFoodList, actualFoodList);
    }

    @Test(expected = Exception.class)
    public void shouldLionWithInvalidSexThrowExeption() throws Exception {
        Lion lion = new Lion("Третий пол", feline);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void shouldLionWithInvalidSexThrowSpecificExeptionMessage() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самей или самка");
        Lion lion = new Lion("Третий пол", feline);
    }

}
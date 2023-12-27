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
        Feline feline = new Feline(animal);
        String actualFamilyName = feline.getFamily();
        assertEquals(expectedFamilyName, actualFamilyName);
    }

    @Test
    public void testGetKittens() {
        int expectedFamilyName = 1;
        Feline feline = new Feline(animal);
        int actualFamilyName = feline.getKittens(1);
        assertEquals(expectedFamilyName, actualFamilyName);
    }

    @Test
    public void testTestGetKittens() {
//        Feline feline = new Feline(animal);
//        // указываю что ожидаю получить
//        Integer expectedFood = 1;
//        // мокаю внутреннюю зависимость метода, чтобы не зависить от нее и просто подставить через стоб значение
//        when(feline.getKittens(1)).thenReturn(expectedFood);
//        // вызываю сам метод и говорю что это получаемое значение
//        Integer actualFood = feline.getKittens(1);
//        // сравниваю оба значения
//        assertEquals(expectedFood, actualFood);

    }
}
package com.example;

import org.junit.Assert;
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
public class LionTest{
    @Mock
    Animal animal;
    @Mock
    Feline feline;



    @Test
    public void testGetKittensMale() throws Exception {
        Lion lion = new Lion("Самец",feline,animal);
        int expectedFood = 3;
        when(feline.getKittens()).thenReturn(expectedFood);
        int actualFood = lion.getKittens();
        assertEquals(expectedFood, actualFood);
    }
    @Test
    public void testGetKittensFemale() throws Exception {
        Lion lion = new Lion("Самка",feline,animal);
        int expectedFood = 5;
        when(feline.getKittens()).thenReturn(expectedFood);
        int actualFood = lion.getKittens();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testDoesHaveManeMalePositive()  throws Exception {
        boolean expectedFood = true;
        Lion lion = new Lion("Самец",feline,animal);
        boolean actualFood = lion.doesHaveMane();
        assertEquals(expectedFood, actualFood);
    }
    @Test
    public void testDoesHaveManeFemaleNegative()  throws Exception {
        boolean expectedFood = false;
        Lion lion = new Lion("Самка",feline,animal);
        boolean actualFood = lion.doesHaveMane();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFoodMale() throws Exception {
        Lion lion = new Lion("Самец",feline,animal);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(animal.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
    @Test
    public void testGetFoodFemale() throws Exception {
        Lion lion = new Lion("Самка",feline,animal);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(animal.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
//    @Test
//    public void testGetFoodThirdGender() throws Exception {
//        // в тестируемый класс передаем мокнутый объект зависимости
//        Lion lion = new Lion("Третий пол",feline,animal);
//        // указываю что ожидаю получить
//        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
//        // мокаю внутреннюю зависимость метода, чтобы не зависить от нее и просто подставить через стоб значение
//        when(animal.getFood("Хищник")).thenReturn(expectedFood);
//        // вызываю сам метод и говорю что это получаемое значение
//        List<String> actualFood = lion.getFood();
//        // сравниваю оба значения
//        assertEquals(expectedFood, actualFood);
//    }
}
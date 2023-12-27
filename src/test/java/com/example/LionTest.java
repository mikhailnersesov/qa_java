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
    public void testGetKittens() throws Exception {
//        Lion lion = new Lion("Самец",feline,animal);
//        Mockito.verify(lion.getKittens(), Mockito.times(1));

    }

    @Test
    public void testDoesHaveMane() {
    }

    @Test
    public void testGetFood() throws Exception {
        // в тестируемый класс передаем мокнутый объект зависимости
        Lion lion = new Lion("Самец",feline,animal);
        // указываю что ожидаю получить
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        // мокаю внутреннюю зависимость метода, чтобы не зависить от нее и просто подставить через стоб значение
        when(animal.getFood("Хищник")).thenReturn(expectedFood);
        // вызываю сам метод и говорю что это получаемое значение
        List<String> actualFood = lion.getFood();
        // сравниваю оба значения
        assertEquals(expectedFood, actualFood);
    }
}
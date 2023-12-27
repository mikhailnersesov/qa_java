package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CatTest{

    @Mock
    Feline feline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        String actualSoundName = cat.getSound();
        String expectedSoundName = "Мяу";
        assertEquals(expectedSoundName, actualSoundName);
    }

    @Test
    public void testGetFood() throws Exception {
        //  альтернатива без моков - создать объекты двух необходимых классов
//        Animal animal = new Animal();
//        Feline feline = new Feline(animal);

        // в тестируемый класс передаем мокнутый объект зависимости
        Cat cat = new Cat(feline);
        // указываю что ожидаю получить
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        // мокаю внутреннюю зависимость метода, чтобы не зависить от нее и просто подставить через стоб значение
        when(feline.eatMeat()).thenReturn(expectedFood);
        // вызываю сам метод и говорю что это получаемое значение
        List<String> actualFood = cat.getFood();
        // сравниваю оба значения
        assertEquals(expectedFood, actualFood);
    }
}
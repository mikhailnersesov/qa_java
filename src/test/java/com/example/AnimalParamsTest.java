package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParamsTest {
    @Parameterized.Parameter(0)
    public String animalKind;
    @Parameterized.Parameter(1)
    public List<String>  foodList;

    static List<String>  foodList1 = Arrays.asList("Трава", "Различные растения");
    static List<String>  foodList2 = Arrays.asList("Животные", "Птицы", "Рыба");

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Травоядное", foodList1},
                {"Хищник", foodList2}
        };
    }

    @Test
    public void testGetFoodGrassFeeding() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = foodList;
        List<String> actualFood = animal.getFood(animalKind);
        assertEquals(expectedFood, actualFood);
    }
}
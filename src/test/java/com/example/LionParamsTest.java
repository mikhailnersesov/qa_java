package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionParamsTest {

    @Parameterized.Parameter(0)
    public String sex;
    @Parameterized.Parameter(1)
    public boolean isMane;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testDoesHaveMane()  throws Exception {
        boolean expectedFood = isMane;
        Lion lion = new Lion(sex);
        boolean actualFood = lion.doesHaveMane();
        assertEquals(expectedFood, actualFood);
    }


}
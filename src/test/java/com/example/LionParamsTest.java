package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamsTest {
    @Mock
    Feline feline;

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
    public void doesHaveManeDifferentPositiveGenderShowsOk() throws Exception {
        boolean expectedManeStatus = isMane;
        Lion lion = new Lion(sex, feline);
        boolean actualManeStatus = lion.doesHaveMane();
        assertEquals(expectedManeStatus, actualManeStatus);
    }


}
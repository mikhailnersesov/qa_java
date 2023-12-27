package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

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
    public void testGetFood() {
    }
}
package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

    private Animal animal;

    @Before
    public void setUp(){
        animal = new Animal();
    }

    @Test
    public void testShouldReturnStr_GetFamily(){
        String animalFamilyStr = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertTrue(animalFamilyStr.equals(animal.getFamily()));
    }
}

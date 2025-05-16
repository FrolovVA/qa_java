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

    @Test
    public void testThrowsExceptions_GetFood() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            animal.getFood("Неизвестный");
        });
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

}

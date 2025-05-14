package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {

    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Spy
    Feline feline;


    @Test
    public void shouldReturnStr_GetSound() {
        Assert.assertEquals("Мяу", cat.getSound());
    }


    @Test
    public void shouldReturnPredatorFoodList_GetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
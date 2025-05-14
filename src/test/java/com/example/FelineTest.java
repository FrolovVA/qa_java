package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    @Spy
    Feline feline;


    @Test
    public void shouldReturnPredatorFoodList_EatMeat() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void shouldReturnStr_GetFamily() {
        //Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void shouldReturnNumberOfKittens1_GetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void shouldReturnNumberOfKittensEqualsParam_GetKittens() {
        int countKittens = 5;
        Mockito.when(feline.getKittens(countKittens)).thenReturn(countKittens);
        Assert.assertEquals(countKittens, feline.getKittens(countKittens));
    }
}
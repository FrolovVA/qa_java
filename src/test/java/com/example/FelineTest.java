package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    private Feline feline;

    @Spy
    Feline spyFeline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testShouldUseGetFood_EatMeat() throws Exception {
        spyFeline.eatMeat();
        Mockito.verify(spyFeline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void testShouldReturnStr_GetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testShouldUseGetKittensWithParam1_GetKittens() {
        spyFeline.getKittens();
        Mockito.verify(spyFeline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void testShouldReturnNumberOfKittensEqualsParam_GetKittens() {
        int countKittens = 5;
        Assert.assertEquals(countKittens, feline.getKittens(countKittens));
    }
}
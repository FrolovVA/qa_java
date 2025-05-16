package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testShouldUseGetFood_EatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testShouldReturnStr_GetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testShouldUseGetKittensWithParam1_GetKittens() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testShouldReturnNumberOfKittensEqualsParam_GetKittens() {
        int countKittens = 5;
        Assert.assertEquals(countKittens, feline.getKittens(countKittens));
    }
}
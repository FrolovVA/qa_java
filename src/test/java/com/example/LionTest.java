package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest extends TestCase {

    private Lion lion;

    @Before
    public void init() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Mock
    Feline feline;

    @Test
    public void testShouldReturnNumberOfKittens1_GetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals("Должен вернуться результат метода getKittens объекта feline класса Feline",
                1, lion.getKittens());
    }

    @Test
    public void testShouldReturnListGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Должен возвращаться лист соответствующий типу животного - Хищник",
                List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
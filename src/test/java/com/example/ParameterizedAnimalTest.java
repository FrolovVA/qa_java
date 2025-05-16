package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class ParameterizedAnimalTest {

    private final String animalKind;
    private final List<String> animalFoodExample;
    private Animal animal;

    public ParameterizedAnimalTest(String animalKind, List<String> animalFoodExample) {
        this.animalKind = animalKind;
        this.animalFoodExample = animalFoodExample;
    }

    @Parameterized.Parameters
    public static Object[][] data(){
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Before
    public void setUp(){
        animal = new Animal();
    }


    @Test
    public void testShouldReturnListOfFood_GetFood() throws Exception {
        List<String> animalFood = animal.getFood(animalKind);
        Assert.assertEquals("Список еды должен соответствовать типу животного",animalFoodExample, animalFood);

    }
}

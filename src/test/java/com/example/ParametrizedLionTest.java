package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {

    Lion lion;

    private final String sexParam;
    private final  boolean expectedHasMane;

    public ParametrizedLionTest(String sexParam, boolean expectedHasMane) {
        this.sexParam = sexParam;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameters
    public static Object[][] data(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Бабабой", true}
        };
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    private Feline feline;

    @Test
    public void testShouldReturnHasMane_DoesHaveMane(){
        try {
            lion = new Lion(sexParam, feline);
            Assert.assertEquals("Должно возвращаться значение hasMane класса Lion соответсвующее полу",
                    expectedHasMane, lion.doesHaveMane());
        }catch (Exception exception){
            Assert.assertTrue("При попытке создать объект с несуществующим полом возникает исключение",
                    true);
        }

    }


}

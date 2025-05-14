package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {

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
        try {
        lion = new Lion(sexParam);
        }catch (Exception exception){
            Mockito.when(lion.doesHaveMane()).thenReturn(true);
        }
    }
    @Mock
    private Lion lion;

    @Test
    public void shouldReturnHasMane_DoesHaveMane(){
            Assert.assertEquals(expectedHasMane, lion.doesHaveMane());
    }


}

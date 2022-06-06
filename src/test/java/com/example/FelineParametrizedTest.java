package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class FelineParametrizedTest {
    private final int KITTENS_COUNT;
    private final int EXPECTED;

    public FelineParametrizedTest(int kittensCount, int expected){
        this.KITTENS_COUNT = kittensCount;
        this.EXPECTED = expected;
    }

    @Parameterized.Parameters
    public static Object[] getKittensCountData() {
        return new Object[][] {
                {1, 1},
                {2_147_483_647, 2_147_483_647},
                {-1, -1},
                {0, 0},
                {-2_147_483_648, -2_147_483_648}
        };
    }

    @Test
    public void getKittensWithParameterPositiveResult(){
        Feline feline = new Feline();
        int actual = feline.getKittens(KITTENS_COUNT);
        assertEquals(EXPECTED, actual);
    }

}

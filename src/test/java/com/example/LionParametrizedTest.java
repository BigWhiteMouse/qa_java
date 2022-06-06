package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParametrizedTest {
    private final String LION_SEX;
    private final boolean EXPECTED;

    public LionParametrizedTest (String lionSex, boolean expected){
        this.LION_SEX = lionSex;
        this.EXPECTED = expected;
    }

    @Parameterized.Parameters
    public static Object[] getLionSexData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void hasManePositiveResult() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion (LION_SEX, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(EXPECTED,actual);
    }
}

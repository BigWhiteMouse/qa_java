package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getKittensWithNoParametersPositiveResult() {
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyPositiveResult() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatPositiveResult(){
        List<String> actual = null;
        try {
            actual = feline.eatMeat();
        } catch (Exception exception) {
            System.out.println(exception);
        }
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }
}

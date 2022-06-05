package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundPositiveResult(){
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected,actual);
    }

    @Test
    public void getFoodPositiveResult(){
        try {
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        } catch (Exception exception) {
            System.out.println(exception);
        }
        Cat cat = new Cat(feline);
        List<String> actual = null;
        try {
            actual = cat.getFood();
        } catch (Exception exception) {
            System.out.println(exception);
        }
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }
}



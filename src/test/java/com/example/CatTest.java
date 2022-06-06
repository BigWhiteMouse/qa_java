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
    public void getFoodPositiveResult() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }
}



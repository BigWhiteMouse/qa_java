package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    Feline feline;

    @Mock
    Feline felineBreeding;

    @Test
    public void getKittensPositiveResult(){
        Mockito.when(felineBreeding.getKittens()).thenReturn(1);
        try {
            Lion lion = new Lion ("Самец", feline, felineBreeding);
            int actual = lion.getKittens();
            int expected = 1;
            assertEquals(expected,actual);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void getFoodPositiveResult(){
        try {
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Lion lion = new Lion("Самец", feline, felineBreeding);
            List<String> actual = lion.getFood();
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expected,actual);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void hasManeExceptionResult(){
        try {
            Lion lion = new Lion("Пол не определен", feline, felineBreeding);
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
}

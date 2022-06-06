package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensPositiveResult() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodPositiveResult() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }


    @Test
    public void hasManeExceptionResult() {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Пол не определен", feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}


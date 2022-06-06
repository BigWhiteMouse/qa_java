package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void getFamilyPositiveResult(){
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected,actual);
    }

    @Test
    public void getFoodExceptionResult(){
        Exception exception = assertThrows(Exception.class, () -> {
            animal.getFood("Вид животного не определен");
        });
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}

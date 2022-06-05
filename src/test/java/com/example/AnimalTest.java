package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        try {
            animal.getFood("Вид животного не определен");
        } catch (Exception exception) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }
}

package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class AnimalParametrizedTest {
    private final String ANIMAL_KIND;
    private final List<String> EXPECTED;

    public AnimalParametrizedTest (String animalKind, List<String> expected){
        this.ANIMAL_KIND = animalKind;
        this.EXPECTED = expected;
    }

    @Parameterized.Parameters
    public static Object[] getAnimalFoodData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodPositiveResult(){
        Animal animal = new Animal();
        try {
            List<String> actual = animal.getFood(ANIMAL_KIND);
            assertEquals(EXPECTED,actual);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

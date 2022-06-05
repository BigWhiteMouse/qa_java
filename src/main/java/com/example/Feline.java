package com.example;

import java.util.List;

public class Feline extends Animal implements Predator, Breeding {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }

    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }


}

package com.cfhayes.patterns.abstractfactory.drinks;

public class Coffee implements HotDrink {

    @Override
    public void consume() {
        System.out.println("Enjoying a hot coffee!");
    }
}

package com.cfhayes.patterns.abstractfactory.drinks;

public class Tea implements HotDrink {

    @Override
    public void consume() {
        System.out.println("Enjoying a hot tea!");
    }
}

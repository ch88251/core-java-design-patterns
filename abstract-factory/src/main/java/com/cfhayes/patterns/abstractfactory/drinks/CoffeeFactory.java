package com.cfhayes.patterns.abstractfactory.drinks;

public class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink create() {
        return new Coffee();
    }
}

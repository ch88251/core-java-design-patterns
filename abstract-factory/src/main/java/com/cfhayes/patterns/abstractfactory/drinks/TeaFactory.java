package com.cfhayes.patterns.abstractfactory.drinks;

public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink create() {
        return new Tea();
    }
}

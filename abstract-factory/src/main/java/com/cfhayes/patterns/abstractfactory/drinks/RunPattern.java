package com.cfhayes.patterns.abstractfactory.drinks;

public class RunPattern {

    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink drink = machine.makeDrink();
        drink.consume();
    }
}

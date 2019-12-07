package com.cfhayes.patterns.builder;

public class LunchOrderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder lunchOrder = builder
                .withBread("Wheat")
                .withCondiments("Ketchup")
                .withDressing("Lettuce")
                .withMeat("Chicken").build();

        System.out.println(lunchOrder);
    }
}

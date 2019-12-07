package com.cfhayes.patterns.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternTests {

    @Test
    @DisplayName("Create lunch order with wheat bread and turkey but no condiments or dressings")
    public void createLunchOrderScenario1() {
        LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();
        LunchOrder lunchOrder = lunchOrderBuilder
                .withBread("Wheat")
                .withMeat("Turkey").build();

        assertEquals("Wheat", lunchOrder.getBread());
        assertEquals(null, lunchOrder.getCondiments());
        assertEquals(null, lunchOrder.getDressing());
        assertEquals("Turkey", lunchOrder.getMeat());
    }

    @Test
    @DisplayName("Create lunch order with wheat bread, ketchup and turkey but no dressings")
    public void createLunchOrderScenario2() {
        LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();
        LunchOrder lunchOrder = lunchOrderBuilder
                .withBread("Wheat")
                .withCondiments("Ketchup")
                .withMeat("Turkey").build();

        assertEquals("Wheat", lunchOrder.getBread());
        assertEquals("Ketchup", lunchOrder.getCondiments());
        assertEquals(null, lunchOrder.getDressing());
        assertEquals("Turkey", lunchOrder.getMeat());
    }

    @Test
    @DisplayName("Create lunch order with wheat bread, ketchup, lettuce and turkey")
    public void createLunchOrderScenario3() {
        LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();
        LunchOrder lunchOrder = lunchOrderBuilder
                .withBread("Wheat")
                .withCondiments("Ketchup")
                .withDressing("Lettuce")
                .withMeat("Turkey").build();

        assertEquals("Wheat", lunchOrder.getBread());
        assertEquals("Ketchup", lunchOrder.getCondiments());
        assertEquals("Lettuce", lunchOrder.getDressing());
        assertEquals("Turkey", lunchOrder.getMeat());
    }
}

package com.cfhayes.patterns.abstractfactory.drinks;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class HotDrinkMachine {

    private List<ImmutablePair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> types = new Reflections("")
                .getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> type : types) {
            String name = type.getSimpleName().replace("Factory","");
            ImmutablePair<String, HotDrinkFactory> pair = new ImmutablePair<>(name, type.getDeclaredConstructor().newInstance());
            namedFactories.add(pair);
        }
    }

    public HotDrink makeDrink() throws Exception {

        System.out.println("Available Drinks:");
        for (int index = 0; index < namedFactories.size(); ++index) {
            ImmutablePair<String, HotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getLeft());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s;
            int i;
            if ((s = br.readLine()) != null && (i = Integer.parseInt(s)) >= 0
            && i < namedFactories.size()) {
                return namedFactories.get(i).getValue().create();
            }
        }

    }
}

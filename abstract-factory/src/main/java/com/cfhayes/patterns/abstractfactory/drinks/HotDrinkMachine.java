package com.cfhayes.patterns.abstractfactory.drinks;

import javafx.util.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {

    private List<Pair<String,HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> types = new Reflections("")
                .getSubTypesOf(HotDrinkFactory.class);

        for (Class<? extends HotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()));
        }
    }

    public HotDrink makeDrink() throws Exception {

        System.out.println("Available Drinks:");
        for (int index = 0; index < namedFactories.size(); ++index) {
            Pair<String, HotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getKey());
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

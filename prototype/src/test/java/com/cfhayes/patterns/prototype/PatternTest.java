package com.cfhayes.patterns.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternTest {

    @Test
    @DisplayName("When I clone a person and change the city of the new person, the original person should still" +
            " have the original city")
    public void testPattern() throws Exception {

        City city = new City("Denver");
        Country country = new Country("United States");
        Person person = new Person("John", 130000, city, country);

        Person personClone = person.clone();
        personClone.setIncome(150000);
        City newCity = new City("Boston");
        personClone.setCity(newCity);

        assertAll("first person",
                () -> assertEquals("John", person.getName()),
                () -> assertEquals(130000, person.getIncome()),
                () -> assertEquals("Denver", person.getCity().getName()),
                () -> assertEquals("United States", person.getCountry().getName()));

        assertAll("second person",
                () -> assertEquals("John", personClone.getName()),
                () -> assertEquals(150000, personClone.getIncome()),
                () -> assertEquals("Boston", personClone.getCity().getName()),
                () -> assertEquals("United States", personClone.getCountry().getName()));

    }
}

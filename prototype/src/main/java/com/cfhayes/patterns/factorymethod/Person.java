package com.cfhayes.patterns.factorymethod;

import lombok.*;

@Setter @Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
class Person implements Cloneable {

    private String name;
    private int income;
    private City city;
    private Country country;

    public Person clone() throws CloneNotSupportedException {
        Person clonedObj = (Person) super.clone();
        clonedObj.city = this.city.clone();
        return clonedObj;
    }
}
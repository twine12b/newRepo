package com.techreturners.exercise002;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {
    private String name;
    private String surname;
    private String city;
    private int age;

    public Person(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }
}

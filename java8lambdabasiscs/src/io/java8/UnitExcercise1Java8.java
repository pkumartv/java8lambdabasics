package io.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.java8.UnitExcercise1.Condition;

public class UnitExcercise1Java8 {

    // Step2: Create an method that prints all elements in the list
    // Step3: Create a method that prints all people that have last name beginning
    // with C
    static void filterByCondition(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person))
                System.out.println(person);

        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronto", 45),
                new Person("Mathew", "Arnold", 39));

        // JAVA 8 lamdbas collection sort
        // Step1: Sort list by last name
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        System.out.println("Persons sorted on last name");
        filterByCondition(people, p -> true);

        System.out.println("Persons with last name starting with C");
        filterByCondition(people, p -> p.getLastName().startsWith("C"));

        System.out.println("Persons with first name starting with C");
        filterByCondition(people, p -> p.getFirstName().startsWith("C"));
    }

}

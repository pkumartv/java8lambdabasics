package io.java8.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java8.Person;

public class UnitExcercise2Java8 {

    // Step2: Create an method that prints all elements in the list
    // Step3: Create a method that prints all people that have last name beginning
    // with C

    //Using functional interfaces available in Java8 at java.util.function  
    private  static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person))
                    consumer.accept(person);
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
        performConditionally(people, p -> true, p -> System.out.println(p) );

        System.out.println("Persons with last name starting with C");
        performConditionally(people, p -> p.getLastName().startsWith("C"),p -> System.out.println(p));

        System.out.println("Persons with first name starting with C");
        performConditionally(people, p -> p.getFirstName().startsWith("C"),p -> System.out.println(p.getFirstName()));
    }

}

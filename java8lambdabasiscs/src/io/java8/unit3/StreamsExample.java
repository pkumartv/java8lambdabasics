package io.java8.unit3;

import java.util.Arrays;
import java.util.List;

import io.java8.Person;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronto", 45),
                new Person("Mathew", "Arnold", 39));

        // people.stream().distinct().filter(predicate)
        people.stream().filter(p -> p.getFirstName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long startTime = System.nanoTime();
        System.out.println(people.stream().count());
        long stopTime = System.nanoTime() - startTime;

        System.out.println(" SEQ took " + stopTime / 100000);
        startTime = System.nanoTime();
        System.out.println(people.parallelStream().count());
        stopTime = System.nanoTime() - startTime;

        System.out.println(" parallel took " + stopTime / 100000);

    }

}

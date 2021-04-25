package io.java8.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java8.Person;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronto", 45),
                new Person("Mathew", "Arnold", 39));

        System.out.println("Persons sorted on last name");
        performConditionally(people, p -> true, System.out::println);
        //using methodReference
        //p -> System.out.println(p)  ===System.out::println

        
 
    }

    // Using functional interfaces available in Java8 at java.util.function
    private static void performConditionally(List<Person> people, Predicate<Person> predicate,
            Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person))
                consumer.accept(person);
        }
    }

}

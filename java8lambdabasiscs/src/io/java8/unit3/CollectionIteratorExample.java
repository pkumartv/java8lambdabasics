package io.java8.unit3;

import java.util.Arrays;
import java.util.List;

import io.java8.Person;

public class CollectionIteratorExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                                            new Person("Charles", "Dickens", 60), 
                                            new Person("Lewis", "Carroll", 42),
                                            new Person("Thomas", "Carlyle", 51), 
                                            new Person("Charlotte", "Bronto", 45),
                                            new Person("Mathew", "Arnold", 39));


        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
            
        }
        System.out.println("Using for in loop");
        for(Person person:people)
            System.out.println(person);

        System.out.println("Using java8 lambda foreach");
        //people.forEach((p) -> System.out.println(p));
        people.forEach(System.out::println);


    }
    
}

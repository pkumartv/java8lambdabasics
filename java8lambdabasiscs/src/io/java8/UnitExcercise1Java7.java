package io.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExcercise1Java7 {

    // Step1: Sort list by last name
    static class sortByLastName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }

    }

    // Step2: Create an method that prints all elements in the list
    static void printAllPerson(List<Person> people) {
        //Java 7
        for (Person person : people) {
            System.out.println(person);
        }
    }

    // Step3: Create a method that prints all people that have last name beginning with C
    static void filterByCondition(List<Person> people, Condition condition) {
        //Java 7 
        //Collections.
        //List<Person> filteredList= new ArrayList<Person>();
        for(Person person: people)
        {
            if(condition.test(person))
                System.out.println(person);

        }
        // for(Person person:people){
        //     if(person.getLastName().startsWith("C"))
        //         filteredList.add(person);
        // }

    }

    public static void main(String[] args) 
    {
        List<Person> people = Arrays.asList
            (
                new Person("Charles", "Dickens", 60), 
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51), 
                new Person("Charlotte", "Bronto", 45),
                new Person("Mathew", "Arnold", 39)
            );

        Collections.sort(people, new sortByLastName());

        //JAVA 7 colleciton sort
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }

        });


        System.out.println("Persons sorted on last name");
        printAllPerson(people);

        System.out.println("Persons with last name starting with C");
        filterByCondition(people,  new Condition(){
            
            @Override
            public boolean test(Person person)
            {
                if(person.getLastName().startsWith("C"))
                    return true;
                return false;
            }

        });

        System.out.println("Persons with first name starting with C");
        filterByCondition(people,  new Condition(){
            
            @Override
            public boolean test(Person person)
            {
                if(person.getFirstName().startsWith("C"))
                    return true;
                return false;
            }

        });
    }

    interface printPeople{
        void print(Person person);
    }

    interface Condition{
        boolean test(Person person);

    }

}

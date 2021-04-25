package io.java8.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    
    public static void main(String[] args) {
        int [] someNumbers= {1,2,5,6};
        int key =2;

         process(someNumbers,key, (a,b) -> System.out.println(a+b));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> consumer) {
        for(int i: someNumbers){
           // System.out.println(i +key);
           consumer.accept(i, key ); 
        }
    }
}

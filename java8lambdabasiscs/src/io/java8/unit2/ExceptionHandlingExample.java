package io.java8.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    
    public static void main(String[] args) {
        int [] someNumbers= {1,2,5,6};
        int key =0;

         //process(someNumbers,key, (a,b) -> System.out.println(a/b));
         //One way to handle exceptions in lambdas
        //  process(someNumbers,key, (a,b) -> {
        //      try {
        //         System.out.println(a/b);     
        //      } catch (ArithmeticException e) {
        //          e.printStackTrace();
        //      }
            
        // });

        //A Better way
        process(someNumbers,key, wrapperLambda((a,b) -> System.out.println(a/b)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> consumer) {
        for(int i: someNumbers){
           // System.out.println(i +key);
           consumer.accept(i, key ); 
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
        return (a,b) -> {
            try {
                System.out.println("Executing from wrapper lambda");
                consumer.accept(a, b);     
            } catch (Exception e) {
                System.err.println("Exception in wrapper lambda");
               // e.printStackTrace();
            }
           
         };
    }
}

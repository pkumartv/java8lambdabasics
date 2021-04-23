package io.java8;

public class TypeInference {


    public static void main(String[] args) {
        //StringLambda lengthLambda= (String s ) -> s.length();
        //StringLambda lengthLambda= ( s ) -> s.length();
        StringLambda lengthLambda=  s  -> s.length();
        System.out.println(lengthLambda.getLength("Pavan"));
        
        printLambda( s  -> s.length());

    }


    public static void printLambda(StringLambda l){
        System.out.println(l.getLength("Hello World Type Inference "));
    }

    interface  StringLambda{
        int getLength(String s);
    }

    
}

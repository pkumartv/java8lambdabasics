package io.java8.unit2;

public class ClosureExample {
    

    public static void main(String[] args) {
        int a=10;
        int b=40;//PreJava8  this should be final
        doProcess(a, (i) -> System.out.println(i+b));
    }
    public static void doProcess(int i,Process p){
        p.process(i);
    }
}

interface Process{
    void process(int i);
}

package io.java8.unit2;

public class ClosureExample {
    

    public static void main(String[] args) {
        int a=10;
        int b=40;//PreJava8  this should be final
        doProcess(a, new Process(){

            @Override
            public void process(int i) {
                //Closure example 
                //b=60;
                //would result in an error 
                    //Local variable b defined in an enclosing scope must be final or effectively finalJava(536871575)
                System.out.println(i+b);
                
            }
            
        });
    }
    public static void doProcess(int i,Process p){
        p.process(i);
    }
}

interface Process{
    void process(int i);
}

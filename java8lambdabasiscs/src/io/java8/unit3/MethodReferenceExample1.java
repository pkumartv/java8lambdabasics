package io.java8.unit3;

public class MethodReferenceExample1{
    public static void main(String[] args) {
        //printMessage(); 
        //Existing way with lambdas
        Thread thread= new Thread(() -> printMessage());
        thread.start();
        //With method reference
        Thread thread2= new Thread(MethodReferenceExample1::printMessage);
        thread2.start();

        // MethodReferenceExample1::printMessage  === () ->  printMessage() 
        //Structure () -> method()
    }

    public static void printMessage(){
        System.out.println("Hello World");
    }
    
}

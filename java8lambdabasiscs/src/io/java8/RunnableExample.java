package io.java8;

public class RunnableExample {


    public static void main(String[] args) {
        Thread myThread = new Thread(
        //Anonymous inner class     
        new Runnable(){
            @Override
            public void run() 
            {
                System.out.println("Inside Runnable ");
            }
        });
    
    
            myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("My Lambda Thread  "));
        myLambdaThread.run(); 
        
    }
   

    
    
}

package io.java8;

public class Greeter
{
    

    
    public void greet(Greeting greeting){
        //System.out.println("Hello World");
        greeting.perform();

    }

    public static void main(String[] args) {
        Greeter greeter= new Greeter();
//        HelloWorld helloWorld= new HelloWorld();
       //MyLambda testunc = () -> System.out.println("");
       Greeting helloWorldGreeting= new HelloWorld();
       Greeting lambdaGreeting = () -> System.out.println("Hello World");

       //Anonymouse inner class
       Greeting innerClassGreeting = new Greeting(){
           public void perform(){
               System.out.println("Anonymouse inner class perform");
           }
       };
    
        //greetings.greet(helloWorld);
        helloWorldGreeting.perform();
        lambdaGreeting.perform();
        innerClassGreeting.perform(); 

        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting );

    }

}
interface MyLambda{
    void foo();
}


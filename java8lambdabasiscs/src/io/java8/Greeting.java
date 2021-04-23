package io.java8;

@FunctionalInterface
public interface Greeting
{
     public void perform();
     //Now we cannot add methods to this and this wont break our lambdas
}
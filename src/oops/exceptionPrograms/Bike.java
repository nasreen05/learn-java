package oops.exceptionPrograms;

public class Bike  extends Vehicle{
    void display() throws  ArithmeticException{
    System.out.println("child class method");
    throw new ArithmeticException("Exception in child class");

    }

}

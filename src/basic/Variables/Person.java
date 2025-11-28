package basic.Variables;

public class Person {
    public static void main(String[] args){
    System.out.println("Excepting main method");
    int remainingAmount = bringVegetableFromMarket();
    System.out.println("Left out amount is "+ remainingAmount);
    // method call
    System.out.println("Completed executed of main method");
    }

    private static int bringVegetableFromMarket() {
    System.out.println("Going to market and bring vegetables");
    return  10;
    }
    //static method we can using class name.method
    //public static int

}

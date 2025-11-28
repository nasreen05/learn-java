package basic.Variables;

public class Substraction {
    public static void main(String[] args){

        char a='A';
        int b=10;
    System.out.println(a+b);
    // variable cannot be declared more than once
        // but we can reassign/change the value  for variable

        int num1=50;
        System.out.println(num1);
        num1=60;
    System.out.println(num1);
    Substraction.substract();
  }
public  static void substract(){
    System.out.println("performing  substraction");
    int num1=20;
    int num2=10;
    int result = num1-num2;
    System.out.println(result);
    }

}
//create 10  class
// create 5 static method
// call static method from main method


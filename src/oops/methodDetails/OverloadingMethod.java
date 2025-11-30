package oops.methodDetails;
// Two or More methods can have same name but  different parameters . such methods are called overloaded methods.

// Method overloading cannot be performend by changing  the return type of method

public class OverloadingMethod {
    static void fool(){
    System.out.println("Good Morning");
    }
    static void fool(int a ){  // a --> parameter
    System.out.println("What is  ur name "+a);
    }
    static  void fool( int a , int b){
    System.out.println(" My name is Reshma"+ a +"Hey");
    System.out.println("My name is Rafia "+ b +"Hello ");
    }

    static  void fool( int a , int b , int c){
        System.out.println(" My name is Reshma"+ a +"Hey");
        System.out.println("My name is Rafia "+ b +"Hello ");
    }

public static void main(String[] args){
        // Method Overloading
        fool();
        fool(3000 , 4000); // 3000--> argument  are actual

}
}
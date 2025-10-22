package MethodDetails;

public class VariableArgument {
/* A   function with vararg can be create in java using the following  syntax:
 public static void f00(int..arr)
 {
 //arr is available here as int [] arr

 too can be called with zero or more  arguments like this foo (7)  foo( 7,8,9) foo( 1,2,3,4,5)
 we can also create a function bar like this
 -> atleast one integer is required now

 }*/


    /* static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a , int b, int c){
        return a+b+c;
    }
    static int sum(int a , int b, int c ,int d){
        return a+b+c+d;
    }*/

    static int sum(int  x , int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;

        }
        return  result;
    }
    public static void main(String[] args){
    System.out.println("Welcome to  Varargs  tutorial");
    System.out.println("The sum of the number is "+sum(400,500));
    System.out.println("The  sum of a+b is "+ sum(300,400));
    System.out.println("The sum of the a+b+c"+sum(300,400,500,600));
    System.out.println(sum(23,45,56,78,89));
    }

}
package oops.methodConcept.technicalPrograms;


// write a function to print nth term of fibonanci series using recursion
public class TechnicalProg3 {
    static int fib(int n){
    /*if(n==1){
        return 0;
        }
     else if(n==2){
         return 1;

     }*/
        if(n==1 || n==2){
            return  n-1;
        }
        else{
         return fib(n-1)+ fib(n-2);

     }


    }
    public static void main(String[] args){
        int result=fib(7);
    System.out.println(result);
    }
        }
package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class IntegerEvenOdd {
    public static void  evenOdd(int n){
        if(n%2==0)
            System.out.println("even  is : "+ n);
        else
            System.out.println("odd is : "+ n  );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        evenOdd(n);
    }
}

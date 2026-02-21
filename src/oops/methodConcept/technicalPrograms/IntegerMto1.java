package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class IntegerMto1 {
    public static void print(int n){
        for(;n>=1;n--)
            System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println(" Enter a Number :");
        int n=sc.nextInt();
        print(n);
    }
}


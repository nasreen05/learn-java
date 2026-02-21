package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class FactorialInteger {
    public  static  void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;

        System.out.println("Factorial of " + n + "is : " + fact);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a Number : ");
        int n=sc.nextInt();factorial(n);
    }

        }

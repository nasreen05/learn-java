package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class Integer1toGiven {
    public static void print(int n) {
        for (int i = 1; i <= n; i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        print(n);
    }
    }


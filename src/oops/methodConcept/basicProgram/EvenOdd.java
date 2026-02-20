package oops.methodConcept.basicProgram;

import java.util.Scanner;

public class EvenOdd {
    public static void evenOdd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        System.out.println(n%2==0 ? n+ "is even ": n+"is Odd");

    }

    public static void main(String[] args) {
        evenOdd();
    }
}

package oops.methodConcept.technicalPrograms;


import javafx.scene.transform.Scale;

import java.util.Scanner;

import static oops.methodConcept.technicalPrograms.BaseExponent.power;

// Define a method to accept a integer and return count of digit of given integer ..........
public class IntegerReturnCountDigit {
    public  static  int count( int n){
        int count=0;
        while( n!=0) {
            n /= 10;
            count++;
        }
            return count;

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =sc.nextInt();
        int count = count(n);
        System.out.println("count of digits of "+ n+ "is : "+count);
    }

    }


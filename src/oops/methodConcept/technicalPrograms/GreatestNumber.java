package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class GreatestNumber {
    public static void greater(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  two number : ");
        int a=sc.nextInt() , b=sc.nextInt();
        System.out.println(a>b ? a+ " is greater ": b+"is greater");
    }

    public static void main(String[] args) {
        greater();
    }
}

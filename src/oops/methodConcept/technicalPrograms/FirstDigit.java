package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class FirstDigit {

    public static int firstNo(int n){
        while(n>9)
            n=n/10;
        return n%10;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(" The first digit is "+ firstNo(n));
    }
}

package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class LastDigit {
    public static  int lastDIgit(int n){

            while(n>99)
                n=n/10;
            return n%10;

        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Number :");
            int n=sc.nextInt();
            System.out.println(" The first digit is "+ lastDIgit(n));
        }
    }


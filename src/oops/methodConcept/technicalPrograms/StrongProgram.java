package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class StrongProgram {

        // Method to find factorial
        static int factorial(int n) {
            int fact = 1;
            for(int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }

        // Method to check strong number
        static void checkStrong(int num) {
            int temp = num;
            int sum = 0;

            while(num > 0) {
                int digit = num % 10;
                sum = sum + factorial(digit);
                num = num / 10;
            }

            if(sum == temp)
                System.out.println(temp + " is a Strong Number");
            else
                System.out.println(temp + " is not a Strong Number");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            checkStrong(num);

            sc.close();
        }
    }


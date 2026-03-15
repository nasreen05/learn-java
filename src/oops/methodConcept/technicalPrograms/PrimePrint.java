package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class PrimePrint {
        // Method to check whether a number is prime
        public static boolean isPrime(int num) {
            if (num < 2)
                return false;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }

        // Method to print n prime numbers starting from 'start'
        public static void display(int start, int n) {
            while (n != 0) {
                if (isPrime(start)) {
                    System.out.println(start);
                    n--;   // decrease count only when prime is printed
                }
                start++;   // move to next number
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter starting number:");
            int start = sc.nextInt();

            System.out.println("Enter how many prime numbers to print:");
            int n = sc.nextInt();

            display(start, n);

            sc.close();
        }
    }

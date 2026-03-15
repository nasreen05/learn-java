package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class NPrimeNumber {

            // Method to check if a number is prime
            public static boolean isPrime(int num) {
                if (num <= 1)
                    return false;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0)
                        return false;
                }
                return true;
            }

            // Method to print nth prime number
            public static void printNthPrime(int n) {
                int count = 0;
                int number = 1;

                while (count < n) {
                    number++;
                    if (isPrime(number)) {
                        count++;
                    }
                }

                System.out.println("Nth Prime Number is: " + number);
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter n value:");
                int n = sc.nextInt();

                printNthPrime(n);

                sc.close();
            }
        }

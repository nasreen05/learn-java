package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class EvenPrint {

        public static void display(int start, int n) {
            while (n != 0) {
                if (start % 2 == 0) {
                    System.out.println(start);
                    n--;  // decrease count only when even number is printed
                }
                start++;  // move to next number
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter starting number:");
            int start = sc.nextInt();

            System.out.println("Enter how many even numbers to print:");
            int n = sc.nextInt();

            display(start, n);

            sc.close();
        }
    }

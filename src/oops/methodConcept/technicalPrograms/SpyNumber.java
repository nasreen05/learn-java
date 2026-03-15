package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class SpyNumber {

        public static boolean isSpy(int n) {
            int sum = 0, prod = 1;

            while (n > 0) {
                int last = n % 10;   // get last digit
                sum += last;         // add to sum
                prod *= last;        // multiply to product
                n = n / 10;          // remove last digit
            }

            return sum == prod;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = sc.nextInt();

            if (isSpy(n))
                System.out.println(n + " is a Spy Number");
            else
                System.out.println(n + " is NOT a Spy Number");

            sc.close();
        }
    }


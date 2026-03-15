package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class SwapFirstLast {

        public static int count(int n) {
            int c = 0;
            while (n != 0) {
                c++;
                n /= 10;
            }
            return c;
        }

        public static int power(int base, int exp) {
            int pow = 1;
            for (int i = 0; i < exp; i++) {
                pow *= base;
            }
            return pow;
        }

        public static int swapFirstLast(int n) {

            int digits = count(n);

            if (digits == 1)   // single digit
                return n;

            int pow = power(10, digits - 1);

            int first = n / pow;
            int last = n % 10;

            int middle = (n % pow) / 10;

            // build new number
            return last * pow + middle * 10 + first;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            System.out.println("After swap: " + swapFirstLast(num));
            sc.close();
        }
    }


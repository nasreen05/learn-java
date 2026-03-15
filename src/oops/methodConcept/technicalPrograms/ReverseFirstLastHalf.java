package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class ReverseFirstLastHalf {

        public static int count(int n) {
            int count = 0;
            while (n != 0) {
                count++;
                n /= 10;
            }
            return count;
        }

        public static int power(int base, int exp) {
            int pow = 1;
            for (int i = 0; i < exp; i++) {
                pow *= base;
            }
            return pow;
        }
        public static int reverse(int n) {
            int rev = 0;
            while (n != 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            return rev;
        }

        public static int transform(int n) {

            int digits = count(n);

            // Step 1: reverse entire number
            int reversed = reverse(n);

            // Step 2: find middle position
            int midPos = digits / 2;

            int d = power(10, digits - midPos);

            int firstPart = reversed / d;
            int secondPart = reversed % d;

            return secondPart * power(10, midPos) + firstPart;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            System.out.println("After swap: " + transform(num));
            sc.close();
        }
    }


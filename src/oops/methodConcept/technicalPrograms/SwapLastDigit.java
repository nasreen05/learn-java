package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class SwapLastDigit {

        public static int swapLastTwo(int n) {
            if (n < 10)
                return n;  // single digit case

            int last = n % 10;
            int secondLast = (n / 10) % 10;
            int remaining = n / 100;

            return remaining * 100 + last * 10 + secondLast;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number:");
            int n = sc.nextInt();

            int result = swapLastTwo(n);

            System.out.println("After swapping last two digits: " + result);

            sc.close();
        }
    }

package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class ReverseLastHalf {
    public static int count(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static int power(int base, int exp) {
        int pow = 1;
        for (int i = 1; i <= exp; i++) {
            pow = pow * base;
        }
        return pow;
    }
    public static int reverseLast(int n) {

        int digits = count(n);
        int d = power(10, digits / 2);

        int lastHalf = n % d;
        int firstHalf = n / d;

        // Reverse last half
        int reverse = 0;
        while (lastHalf != 0) {
            reverse = reverse * 10 + lastHalf % 10;
            lastHalf = lastHalf / 10;
        }
        n = firstHalf * d + reverse;
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value ");
        int n = sc.nextInt();
        int result = reverseLast(n);
        System.out.println("After swapping last digits: " + result);
        sc.close();
    }
}


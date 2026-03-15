package oops.methodConcept.technicalPrograms;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ReverseNumber {
        public static int reverse(int n) {
            int rev = 0;

            for (int temp = n; temp != 0; temp /= 10) {
                int last = temp % 10;   // use temp here
                rev = rev * 10 + last;
            }

            return rev;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number:");
            int n = sc.nextInt();

            int result = reverse(n);

            System.out.println("Reversed number: " + result);
        }
    }

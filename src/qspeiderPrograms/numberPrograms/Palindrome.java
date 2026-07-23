package qspeiderPrograms.numberPrograms;

import java.util.Scanner;

public class Palindrome {
        static void checkpalindrome(int n) {
            int temp = n, rem, rev = 0;

            while (temp != 0) {
                rem = temp % 10;
                temp = temp / 10;
                rev = rev * 10 + rem;
            }

            if (rev == n) {
                System.out.println("Palindrome number");
            } else {
                System.out.println("Not Palindrome number");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number");
            int n = sc.nextInt();

            checkpalindrome(n);

            sc.close();
        }
    }
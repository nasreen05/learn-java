package qspeiderPrograms.numberPrograms;

import java.util.Scanner;

public class HappyNumber {

        static int squareSum(int n) {

            int sum = 0;

            while (n > 0) {

                int rem = n % 10;

                sum += rem * rem;

                n /= 10;
            }

            return sum;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Number : ");

            int num = sc.nextInt();

            while (num != 1 && num != 4) {
                num = squareSum(num);
            }

            if (num == 1)
                System.out.println("Happy Number");
            else
                System.out.println("Sad Number");
        }
    }
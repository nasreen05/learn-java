package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class ArmstrongPro {

        // Method to check Armstrong number
        static void checkArmstrong(int num) {
            int temp = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + (digit * digit * digit);
                num = num / 10;
            }

            if (sum == temp)
                System.out.println(temp + " is an Armstrong Number");
            else
                System.out.println(temp + " is not an Armstrong Number");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            checkArmstrong(num);

            sc.close();
        }
    }

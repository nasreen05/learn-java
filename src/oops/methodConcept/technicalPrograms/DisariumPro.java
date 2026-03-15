package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class DisariumPro {

        // Method to count digits
        static int countDigits(int num) {
            int count = 0;
            while(num > 0) {
                count++;
                num = num / 10;
            }
            return count;
        }

        // Method to check Disarium number
        static void checkDisarium(int num) {
            int temp = num;
            int digits = countDigits(num);
            int sum = 0;

            while(num > 0) {
                int digit = num % 10;
                sum = sum + (int)Math.pow(digit, digits);
                digits--;
                num = num / 10;
            }

            if(sum == temp)
                System.out.println(temp + " is a Disarium Number");
            else
                System.out.println(temp + " is not a Disarium Number");
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            checkDisarium(num);

            sc.close();
        }
    }



package oops.methodConcept.technicalPrograms;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class NEvenNumber {


        // Method to print the nth even number
        public static void printN(int n) {
            for (int i = 1; n != 0; i++) {
                if (i % 2 == 0) {
                    n--;
                    if (n == 0) {
                        System.out.println("Nth Even Number is: " + i);
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter n value:");
            int n = sc.nextInt();

            printN(n);   // Calling the method

            sc.close();
        }
    }

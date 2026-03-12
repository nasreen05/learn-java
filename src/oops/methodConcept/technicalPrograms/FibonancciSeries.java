package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class FibonancciSeries {
    public static void fibonancci(int n) {

                int a = 0, b = 1;

                while (n > 0) {
                    System.out.print(a + " ");
                    int c = a + b;
                    a = b;
                    b = c;
                    n--;
                }
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the Number: ");
                int n = sc.nextInt();

                fibonancci(n);

                sc.close();
            }
        }

package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class NeonNumber {
    public static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq != 0){
            int last = sq % 10;
        sum = sum + last;
    }
            return sum==n;
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number  :");
            int n = sc.nextInt();
            System.out.println(isNeon(n) ? n + "isNeon" : n + "is not Neon");
        }

    }

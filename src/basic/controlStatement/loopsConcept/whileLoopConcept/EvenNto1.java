package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class EvenNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();
        int end=1;
        while(n>=end) {
            if (n % 2 == 0)
                System.out.println(n);
            n--;
        }

    }
    }

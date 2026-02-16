package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class Odd1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int start=1;
        int end=sc.nextInt();
        while(start<=end) {
            if (start % 2 != 0)
                System.out.println(start);
            start ++;
        }

    }
    }


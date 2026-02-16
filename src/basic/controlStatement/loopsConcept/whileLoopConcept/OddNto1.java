package basic.controlStatement.loopsConcept.whileLoopConcept;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class OddNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int start= sc.nextInt();
        int end=sc.nextInt();
        while(start<=end) {
            if (start % 2 != 0)
                System.out.println(start);
            start ++;
        }

    }
    }

package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class NumberMtoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int start=sc.nextInt(),end=sc.nextInt();
        while(start<=end){
            System.out.println(start);
            start++;
        }
    }
}

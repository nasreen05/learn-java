package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class OddNtoM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();
        int m= sc.nextInt();
        while(n>=m) {
            if (n % 2 == 0)
                System.out.println(n);
            n--;
        }

    }
}


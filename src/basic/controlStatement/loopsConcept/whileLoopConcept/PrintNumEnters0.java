package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;
//Print Number until user enters 0

public class PrintNumEnters0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {
            System.out.print(num);
            num = sc.nextInt();
        }
    }
}

package basic.controlStatement.decisionMakingStatement;

import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the  Rating : ");
         int rating =sc.nextInt();
         if( rating == 5)
             System.out.println(" 30% increment");
         else if (rating ==4)
             System.out.println(" 20 % increment");
         else if (rating == 3)
             System.out.println(" 10 % increment");
             else
             System.out.println(" No increment");

         }
}

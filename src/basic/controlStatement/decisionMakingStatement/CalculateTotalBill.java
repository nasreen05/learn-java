package basic.controlStatement.decisionMakingStatement;

import java.util.Scanner;

public class CalculateTotalBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bill");
        int bill=sc.nextInt();
        if(bill >=5000)
            System.out.println(" 30 % Discount");
        else if (bill >=3000)
            System.out.println(" 20 % Discount");
        else if (bill >= 1000)
            System.out.println(" 10% Discount");
        else
            System.out.println("No discount");

        }
}

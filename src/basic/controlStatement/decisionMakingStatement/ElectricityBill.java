package basic.controlStatement.decisionMakingStatement;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the bill");
        int Units= sc.nextInt();
        if(Units <=100 )
            System.out.println(" Rs. 1 per unit");
        else if (Units <=200)
            System.out.println("Rs. 2 Per unit");
        else if (Units <=300)
            System.out.println(" Rs. 3 Per units");
        else if (Units <= 400)
            System.out.println(" Rs. 45 Per units");
        else
            System.out.println(" no Bill ");

        }

    }
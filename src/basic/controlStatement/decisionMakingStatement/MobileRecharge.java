package basic.controlStatement.decisionMakingStatement;

import java.util.Scanner;

public class MobileRecharge {
    public static void main(String[] args) {
        long myNum=1111111110l;
        double balance=10000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        long Num=sc.nextLong();
        if( Num==myNum) {
            System.out.println(" Enter the recharge amount :");
            double amount = sc.nextDouble();
            if (amount < 50)
                System.out.println("Minimum recharge not allowed");
            else if (amount > 5000)
                System.out.println(" Recharge limited exceeded");
            else
                System.out.println("Recharge successfull ");
        }
        else
            System.out.println("Invalid Number ");

            }

        }

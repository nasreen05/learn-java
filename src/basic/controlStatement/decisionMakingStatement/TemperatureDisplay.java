package basic.controlStatement.decisionMakingStatement;

import java.util.Scanner;

public class TemperatureDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the Temperature : ");
        int temp=sc.nextInt();
        if(temp >40)
            System.out.println("Very Hot");
        else if (temp >=30 && temp <=40 )
            System.out.println("Hot");
        else if (temp >=20 && temp <=29)
            System.out.println(" Normal");
        else
            System.out.println(" Cold");

        }

    }

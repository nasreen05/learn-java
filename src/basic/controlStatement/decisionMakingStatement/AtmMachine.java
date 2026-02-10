package basic.controlStatement.decisionMakingStatement;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        int pin = 1234;
        double bal = 1200000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pin :");
        int upin = sc.nextInt();
        if (pin == upin) {
            System.out.println(" Enter the withdraw amount :");
            double amount = sc.nextDouble();
            if (bal < 500)
                System.out.println("Insufficient balance");
            else if (amount > bal)
                System.out.println("Invalid withdraw amount");
            else if (amount > 20000)
                System.out.println(" Limit exceeded");
            else {
                bal -= amount;
                System.out.println("Transaction successful");
                System.out.println(" Remaining balance " + bal);
            }
        } else {
            System.out.println("Invalid Pin");

        }
    }
}
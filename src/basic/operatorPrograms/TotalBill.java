package basic.operatorPrograms;

import java.util.Scanner;

public class TotalBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the total bill :");
        double amount =sc.nextDouble();
        amount= amount >=5000? (amount - (amount * 0.1)) :amount;
        System.out.println(amount);

    }
}

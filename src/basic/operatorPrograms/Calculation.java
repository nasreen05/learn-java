package basic.operatorPrograms;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the rahul  earns amount  Per day");
      int rahulEarn=sc.nextInt();
        System.out.println(" Enter the working day ");
        int workingDay=sc.nextInt();
        int  totalEarn=rahulEarn*workingDay;
        System.out.println("Total earn in 26 days = "+totalEarn);
    }
}

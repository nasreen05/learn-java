package basic.operatorPrograms;

import java.io.Serializable;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Experience :");
        int ex= sc.nextInt();
        System.out.println("Enter the amount :");
        int amount=sc.nextInt();
                String  bouns= ex < 5 ? "no Bonus" : String.valueOf((amount += 10000));
        System.out.println(amount);
    }
}

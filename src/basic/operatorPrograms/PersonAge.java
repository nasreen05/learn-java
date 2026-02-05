package basic.operatorPrograms;

import java.util.Scanner;

public class PersonAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age :");
         int age=sc.nextInt();
         String res=age>18 ?"Eligible  to vote ": "Not Eligible for vote ";
        System.out.println(res);
    }
}

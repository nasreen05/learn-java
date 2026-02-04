package basic.operatorPrograms;

import java.util.Scanner;

public class Attendence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total student = ");
        int totalStu=sc.nextInt();
        System.out.println("Enter the  total absent =");
        int absent =sc.nextInt();
        int present =totalStu- absent;
        System.out.println(" Total present student = "+ present);
    }
}

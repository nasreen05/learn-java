package basic.scannerClass;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no ");
        int rollNo=sc.nextInt();
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the fees");
        double fees=sc.nextDouble();
        System.out.println("Enter the rating of the school ");

        float rating =sc.nextFloat();
        System.out.println("Details-------------------> ");
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(fees);
        System.out.println(rating);

    }


}

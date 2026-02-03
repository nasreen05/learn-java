package basic.scannerClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmpDetails {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter id");
        int id=s.nextInt();
        System.out.println("Enter name");
        String name=s.next();
        System.out.println("Enter salary");
        double salary =s.nextDouble();
        System.out.println("Enter designation");
        String designation=s.next();
        System.out.println("Enter email");
        String email=s.next();
        System.out.println("Enter mobile number");
        long mobileNo=s.nextLong();
        System.out.println("Enter years of exp");
        double exp=s.nextDouble();
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(designation);
        System.out.println(email);
        System.out.println(mobileNo);
        System.out.println(exp);
    }
}

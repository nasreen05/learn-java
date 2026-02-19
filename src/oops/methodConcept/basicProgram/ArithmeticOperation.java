package oops.methodConcept.basicProgram;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public static void  sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(a+"-"+b+"="+(a-b));
    }
    public static void mul(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(a+"*"+b+"="+(a*b));
    }
    public static void div(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(a+"/"+b+"="+(a/b));
    }

    public static void main(String[] args) {
        add();
        sub();
        mul();
        div();
    }

}

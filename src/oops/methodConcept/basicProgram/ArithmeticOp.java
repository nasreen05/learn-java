package oops.methodConcept.basicProgram;

import java.util.Scanner;

public class ArithmeticOp {
    public static void add(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public static void  sub(int a, int b){

        System.out.println(a+"-"+b+"="+(a-b));
    }
    public static void mul(int x, int y){

        System.out.println(x+"*"+y+"="+(x*y));
    }
    public static void div(int x , int y){
        System.out.println(x+"/"+y+"="+(x/y));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        add(10,20);
        sub(10,2);
        mul(10,2);
         div(10,2);
    }


    }



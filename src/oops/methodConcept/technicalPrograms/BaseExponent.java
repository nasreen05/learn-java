package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

//Define a method to accept base and Exponent value and written power value
public class BaseExponent {
    public static int power(int base , int exp){
        int pow=1;
        for(int i=1;i<=exp;i++) {
            pow = pow * base;
        }
        return pow;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and exp : ");
        int base=sc.nextInt(), exp=sc.nextInt();
        int power=power(base , exp);
    }
    }

;

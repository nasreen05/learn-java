package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class LastDigitFibonancci {
    public static  void Lastfibonancci(int n){
        int a=0, b=1;
        while(n-1 !=0){
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
        System.out.println(a);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
            int n=sc.nextInt();
            Lastfibonancci(n);

        }
    }


package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class DisariumNumber {
    public static int count (int n){
        int count =0;
        while(n!=0) {
            count++;
            n = n / 10;
        }
        return  count;
    }
    public static  int power (int base , int exp){
        int pow=1;
        for(int i=1;i<=3;i++)
            pow=pow* base;
        return  pow;
    }
    public  static  int sum(int n){
        int exp=count(n), sum=0;
        while(n!=0) {
            int base = n % 10;
            int power = power(base, exp--);
            sum = sum + power;
            n = n / 10;
        }
        return  sum;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N value ");
        int n=sc.nextInt(); int sum=sum(n);
        System.out.println(sum==n? n+" is Disarium  Number ": n+ "is not Disarium Number  ");
    }
}


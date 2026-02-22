package oops.methodConcept.technicalPrograms;

import javafx.scene.transform.Scale;

import java.util.Scanner;
// Strong number example-> 145 --> 1!=1 + 4!=24 +5!=120 => 145

public class StrongNumber {
    public  static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        return  fact;

        }
        public static int sum(int n) {
            int sum = 0;
            while (n != 0) {
                int last = n % 10;
                sum += factorial(last);
                n /= 10;
            }
            return sum;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println(sum==n ?n+"is strong":n+"is not strong");
    }
}

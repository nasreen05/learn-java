package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class LCMNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();

       int x=a, y=b;
       while (a!=b){
           if(a>b)
               a=a-b;
           else
               b=a-b;
       }
   int gcd=a;
       int lcm=(x*y)/gcd;
        System.out.print("lcm"+lcm);
    }
}

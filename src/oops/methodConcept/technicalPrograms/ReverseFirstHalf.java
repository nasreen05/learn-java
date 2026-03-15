package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class ReverseFirstHalf {
        public static int count(int n)
        {
            int count=0;
            while(n!=0)
            {
                count++;
                n/=10;
            }
            return count;
        }
        public static int power(int base, int exp)
        {
            int pow=1;
            for(int i=1; i<=exp; i++)
            {

                pow=pow * base;
            }
            return pow;
        }
        public static int reverse(int n)
        {
            int rev=0;
            for(; n!=0; n/=10)
            {
                int last=n%10;
                rev=rev *10+last;
            }
            return rev;
        }
        public static int reverseFirstHalf(int n)   //125253
        {
            int count=count(n);  //6
            int den=power(10,count/2); //10,3
            int firsthalf=n/den;//125
            int rev=reverse(firsthalf);//521
            int lasthalf=n%den;//253
            return rev*den+lasthalf;//521000+253=521253
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int num=sc.nextInt();
            System.out.println("After swap: "+reverseFirstHalf(num));
            sc.close();
        }
    }



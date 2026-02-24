package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int rev=0;
        for(int temp=n;temp!=0;temp/=10){
            int last=temp%10;
            rev =rev*10+last;
        }
        return  rev==n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println(isPalindrome(n)?n+ " is Palindrome " : n + " Is not Palindrome " );
    }
}

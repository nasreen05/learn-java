package basic.operatorPrograms;

import java.util.Scanner; //step 1
class ScannerCls{
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // step2-----object create 

		System.out.println("enter your name");
		String name= sc.next();                 // take input value as string
        System.out.println("Your name is "+name);

        System.out.println("Enter your age");
        int age = sc.nextInt();                 // take input value as int
        System.out.println("your age is " +age);
	}	
}
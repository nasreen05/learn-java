package advance.exceptionConcept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
    System.out.println("program starts...");
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter your name");
   String name =sc.nextLine();
   
   System.out.println("enter your age");
   int age=0;
   
   try {
    age=sc.nextInt();
   }catch (InputMismatchException e) {
	   System.out.println("You entered a wrong value");
	   
   }
   
   System.out.println("Enter your Salary ");
   double sal = sc.nextDouble();
   
   System.out.println("your Details");
   System.out.println(name);
   System.out.println(age);
   System.out.println(sal);
   System.out.println("Program ends.....");
	}
   
   
}



// 1. describe the excaptionn
//2. line no of exception
//3. program  terminated

















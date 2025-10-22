package TechnicalPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialPro {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
 /* int num= sc.nextInt();
  long fact=1;
  for(int i=1;i<=num;i++){
      fact=fact*i;
      System.out.println("The number is " + num + " Factorial number is "+fact);
      */

  int num=5;
  int i=1;
      int  fact=1;
  while(i<=num){
      fact=fact*i;
      i++;
  }
  System.out.println("The Fatorial Nnumber is "+ num + " Factorial " + fact );


  }
   }
package basic.stringPrograms;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] agrs) {
      Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Year :");
      int year =sc.nextInt();
      if(year %4==0 || year%400==0){
      System.out.println("Its a Leap Year ");
      }
      else if(year %100!=0){
      System.out.println("Its not a Leap year");
      }

  }
    }
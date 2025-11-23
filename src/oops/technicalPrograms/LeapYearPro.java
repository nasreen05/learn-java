package oops.technicalPrograms;

import java.util.Scanner;

public class LeapYearPro {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Year : ");
    int year=sc.nextInt();
    if(year % 4==0 || year %400==0){
      System.out.println(" Leap Year");
    }else if(100 !=0){
      System.out.println(" Not a Leap Year");
    }
    }
}

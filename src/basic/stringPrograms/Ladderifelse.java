package basic.stringPrograms;

import java.util.Scanner;

public class Ladderifelse {
    public static void main(String[] args){
        int age;
    System.out.println("Enter your Age");
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();

    if(age>20){
      System.out.println("excelent ");
    }
    else if(age >85){
      System.out.println("outstanding ");
      }
    else if(age >95){
        System.out.println("good");

      }
    else{
      System.out.println("u r fail  ");
      if(age >20){
        System.out.println("u r adult");
      }
     // sc.close();
    }
    }

    }


    /* switch case is used when we have to make a choice
 between number of alternatives for a given variables
   */


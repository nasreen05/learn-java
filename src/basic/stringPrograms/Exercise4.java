package basic.stringPrograms;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter the income in Lakh per amount :");
        float tax=0;
        float income=sc.nextFloat() ;

        if(income<2.5){
            tax=tax+0;
            }
        else if(income>2.5f && income < 5f){
            tax=tax + 0.05f*(income - 2.5f);
            }
        else if(income>5f &&  income< 10.0f){
        tax= tax + 0.05f * (5.0f -2.5f);
        tax=tax + 0.02f*(income -2.5f);
        }
       else if(income> 10.0f){
    tax= tax + 0.05f * (5.0f -2.5f);
    tax=tax + 0.03f*(income -2.5f);
}
    System.out.println("The total tax paid by the employee is :"+tax);

       }
       }




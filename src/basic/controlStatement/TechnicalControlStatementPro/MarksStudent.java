package basic.controlStatement.TechnicalControlStatementPro;

import java.util.Scanner;

public class MarksStudent {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         float total=100;
         System.out.print("Enter  math marks");
         float a= sc.nextFloat();
         System.out.println("Enter science marks");
         float b= sc.nextFloat();
         System.out.println("Enter biology marks");
         float c=sc.nextFloat();
         float sum=(a+b+c % 3);
         System.out.println("Total marks"+sum);
         float percantage=(sum/total)*100;
         System.out.println("total Percantage"+percantage);


    }
}

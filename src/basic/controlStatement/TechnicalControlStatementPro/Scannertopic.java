package basic.controlStatement.TechnicalControlStatementPro;


import java.util.Scanner;

public class Scannertopic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);// use scanner for create new object
    System.out.println("Enter the number 1");
  float a= sc.nextFloat();
  int a2= sc.nextInt();
    boolean b1=sc.nextBoolean();
    System.out.println(b1);

      System.out.println("Enter the number  2");
    int a1= sc.nextInt();
    int sum=a2+a1;
    String str= sc.next();
    String str1=sc.nextLine();
    System.out.println(sum);
  }
 }
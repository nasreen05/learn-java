package basic.stringPrograms;

import java.util.Scanner;

public class SwitchCaseProg {
 public static void main(String[]agrs){
 Scanner sc= new Scanner(System.in);
 int age=34;
    System.out.println(" Enter the Age :");
    age = sc.nextInt();
    switch (age){
        case 25:
        System.out.println("u a selected for IIT");
        break;

        case 45:
        System.out.println("u are selected for MIT");
        break;

        case 67:
        System.out.println("u r selected for  PHD");
        break;
        default:
        System.out.println(" All The Best");

    }
    System.out.println("Good Luck");
 }
}
package basic.operatorPrograms;

import java.util.Scanner;

public class WaterBottles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter total water bottles : ");
        int totalBottles=sc.nextInt();
        System.out.println("enter  each the box hold bottles :");
        int holdBottles=sc.nextInt();
        int fullBox=totalBottles/holdBottles;
        System.out.println("Enter the full boxes :"+fullBox);
        int leftOver=totalBottles-fullBox;
        System.out.println(" total bottles will be left over :"+ leftOver);
    }
}

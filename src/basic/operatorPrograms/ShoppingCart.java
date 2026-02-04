package basic.operatorPrograms;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the total books");
        int totalbook=s.nextInt();
        System.out.println("Enter the cost of one notebook");
        int cost=s.nextInt();
        int pay=totalbook*cost;
        System.out.println("the total amount she  pay  "+ pay);
    }
}

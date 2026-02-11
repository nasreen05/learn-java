package basic.controlStatement.jumpingConcept;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("press 5 for modulus division ");
        int choice= sc.nextInt();
        System.out.println("enter 2 numbers");
        int a =sc.nextInt(), b=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println(a+" + "+ b+ (a+b));
                break;
            case 2:
                System.out.println(a+" - "+ b+ (a-b));
                break;
            case 3:
                System.out.println(a+" * "+ b+ (a*b));
                break;
            case 4:
                System.out.println(a+" / "+ b+ (a/b));
                break;
            case 5:
                System.out.println(a+" % "+ b+ (a%b));
                break;
            default:
                System.out.println(" Invalid input");
        }
    }
}

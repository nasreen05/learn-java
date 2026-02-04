package basic.operatorPrograms;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the total subject  :");
        int totalSub=sc.nextInt();
        System.out.println("Enter  first subject :");
        int first=sc.nextInt();
        System.out.println("Enter second subject :");
        int sec=sc.nextInt();
        System.out.println("Enter third subject :");
        int third=sc.nextInt();
        System.out.println("Enter the four subject :");
        int fourth=sc.nextInt();
        int totalMarks=first+sec+third+fourth;
        System.out.println("total Marks : "+totalMarks);
        int average =totalMarks/totalSub;
        System.out.println("Total average score : "+ average);

    }
}

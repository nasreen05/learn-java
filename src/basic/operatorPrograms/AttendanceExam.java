package basic.operatorPrograms;

import java.util.Scanner;

public class AttendanceExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the attendance :");
        int att=sc.nextInt();
        String allow=att >=75 ?" Access ":"No Access";
        System.out.println(allow);
    }
}

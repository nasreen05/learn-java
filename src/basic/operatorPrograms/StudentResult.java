package basic.operatorPrograms;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the score : ");
        int a= sc.nextInt();
        String res=a>40 ? a + "Pass":"fail";
        System.out.println(res);
    }
}

package qspeiderPrograms.numberPrograms;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        String num =sc.next();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            switch(ch){
                case '1' :
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                        System.out.println("Three");
                        break;
                case '4':
                    System.out.println("Five");
                break;
                default:
                    System.out.println("Invalid");


            }
        }
        sc.close();
    }
}

package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

class SmallestDigitNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int min=9;
        while(num>0){
            int digit = num%10;
            if(digit <min)
                min=digit;
            num/=10;

        }
        System.out.println("Smallest digit: "+min);

       }
}


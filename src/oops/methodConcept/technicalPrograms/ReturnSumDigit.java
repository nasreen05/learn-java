package oops.methodConcept.technicalPrograms;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class ReturnSumDigit {

    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += last;
            n /= 10;
        }
            return sum;
        }



        public static void main (String[]args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n = s.nextInt();
            int sum = sum(n);
            System.out.println("sum of digits of " + n + "is " + sum);
        }
    }


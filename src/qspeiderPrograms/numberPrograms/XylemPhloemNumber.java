package qspeiderPrograms.numberPrograms;

import java.util.Scanner;

public class XylemPhloemNumber {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Number : ");

            int num = sc.nextInt();

            int temp = num;

            int extreme = 0;
            int mean = 0;

            int last = temp % 10;
            extreme += last;

            temp /= 10;

            while (temp >= 10) {

                mean += temp % 10;

                temp /= 10;
            }

            extreme += temp;

            System.out.println("Extreme Sum = " + extreme);
            System.out.println("Mean Sum = " + mean);

            if (extreme == mean)
                System.out.println("Xylem Number");
            else
                System.out.println("Phloem Number");
        }
    }

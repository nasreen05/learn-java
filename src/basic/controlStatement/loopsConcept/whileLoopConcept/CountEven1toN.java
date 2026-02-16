package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class CountEven1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int start=1,end = sc.nextInt(),count=0;
        while (start <= end) {
            if(start%2==0)
            count++;
            start++;
        }
        System.out.println( count);

        sc.close();
    }

}

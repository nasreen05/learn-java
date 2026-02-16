package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class NaturalNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter n Value");
        int start=sc.nextInt();
                int end=1;
        while(start>=end){
            System.out.println(start);
            start--;

        }
    }
}

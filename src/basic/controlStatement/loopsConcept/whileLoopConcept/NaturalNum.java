package basic.controlStatement.loopsConcept.whileLoopConcept;
import java.util.Scanner;
public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter n Value");
        int start=1, end= sc.nextInt();
        while(start<=end){
            System.out.println(start);
            start++;

        }
    }
}

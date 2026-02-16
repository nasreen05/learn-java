package basic.controlStatement.loopsConcept.whileLoopConcept;

public class DigitReverse {
    public static void main(String[] args) {
        int num=896765;
        while (num!=0){
            int last=num%10;
            System.out.print(last);
            num=num/10;

        }
    }
}

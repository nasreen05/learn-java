package basic.controlStatement.loopsConcept.whileLoopConcept;

public class AllPrimeNumbers {
    public static void main(String[] args) {

        int num=2;
        while(num<=100){
            int i=2,count=0;
            while(i<=num/2){
                if(num%i==0){
                    count++;
                    break;
                }
                i++;
            }
            if(count==0)
                System.out.print(num+" ");
                num++;
            }
        }
    }


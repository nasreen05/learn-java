package basic.controlStatement.loopsConcept.whileLoopConcept;

public class PrimeNumber {
    public static void main(String[] args){

    int num=12;
    int count=0;
    int i=1;

    while(i<=num){
        if(num%i==0){
            count++;
        }
        i++;
    }
    if(count==2){
      System.out.println("Prime Number");
    }else{
      System.out.println("not a Prime");
    }
        }
    }


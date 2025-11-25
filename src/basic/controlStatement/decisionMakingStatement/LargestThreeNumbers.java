package basic.controlStatement.decisionMakingStatement;

public class LargestThreeNumbers {
    public static void main(String[] args){
        int a=23;
        int b=34;
        int c=56;
        if(a>b){
            if(a>c){
        System.out.println(" Largest element "+a);
            }else{
        System.out.println(" Largest element "+c);
        }
            }else{
      if (b > c) {
        System.out.println("Largest element " + b);
            }else{
        System.out.println("Largest element"+c);
      }

        }
    }
}

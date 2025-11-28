package basic.controlStatement.loopsConcept.forLoopConcept;

public class FibonacciProgram {
    public static void main(String[] args){
     int f=0,r=1,s;
     for(int i=1;i<=10;i++){
         s=f+r;
         f=r;
         r=s;
      System.out.println(s+" ");
     }
    }
}

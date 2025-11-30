package basic.controlStatement.loopsConcept.whileLoopConcept;

public class NumberReverse {
    public static void main(String[] args){
       int n=98765;
       int r=0;
       int o=0;
       int i=1;
       while(i<=n){
           r=n%10;
           o=o*10+r;
           n=n/10;

      System.out.println(o);
      i++;
    }
  }
}

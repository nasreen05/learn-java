package basic.controlStatement.loopsConcept.whileLoopConcept;

public class FactorialNumber {
  public static void main(String[] args) {
      int num=5;
      int fact=1;
      int i=1;
      while(i<=num){
          fact=fact*i;
      System.out.println(fact);
          i++;
      }
  }
  }
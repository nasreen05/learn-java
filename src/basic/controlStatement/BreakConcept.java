package basic.controlStatement;

public class BreakConcept {
    public static void main(String[] args){
      for(int i=1;i<=5;i++){
      System.out.println("break the line"+i);
      if(i==3){
          break;
      }
      }
      for(int j=1;j<=5;j++){
      System.out.println("continue the process");
      if(j==3){
          continue;
      }
      System.out.println("continue "+j);
      }
    }
}

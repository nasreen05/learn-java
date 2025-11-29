package basic.controlStatement.loopsConcept.whileLoopConcept;

public class CountDigit {
  public static void main(String[] args) {
      int num=987663;
      int count=0;
      int temp=num;
      while(temp!=0){
          temp=temp/10;
          count++;

      }
      System.out.println("count " + count);
  }
}

package basic.controlStatement.loopsConcept.forLoopConcept;

public class ReverseProgram {
  public static void main(String[] args) {

      int number=567;
      int reminder=0;
      int  output=0;

      for(int i=1;i<=3;i++){
          reminder=number%10;
          output=output*10+reminder;
          number=number%10;

      System.out.println("output"+output);
  }
}
}
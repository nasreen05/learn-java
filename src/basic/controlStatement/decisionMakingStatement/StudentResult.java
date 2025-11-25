package basic.controlStatement.decisionMakingStatement;

import javafx.util.converter.PercentageStringConverter;

public class StudentResult {
  public static void main(String[] args) {
      int s1=56;
      int s2=78;
      int s3=53;
      int s4=88;
      int s5=98;
      int total=s1+s2+s3+s4+s5;
      int percent=total/5;
      if(percent<35){
      System.out.println("Fail");
      }else{
      System.out.println("pass");
      }
      if(s1>=90 && s2>=90 && s3>=90 && s4>=90 && s5>=90){
      System.out.println("Distinction");
      }else if(s1<40 && s2<40  && s3<40 && s4<40 && s5<40){
System.out.println("pass but needs improvement");
      }else if(percent>=75){
      System.out.println("First Class");
      }else{
      System.out.println("second class");
      }


      }
}

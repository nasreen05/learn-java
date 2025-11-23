package basic.operatorPrograms;

public class LogicalAnd {
  public static void main(String[] args){
      int amount=9000;
      int age=20;
      if(20==age  && 500<=amount--){
          amount=amount-500;
      System.out.println("YOu can withdraw");
      }else{
      System.out.println("you cannot withdraw");
      }
    System.out.println(amount);
  }
}

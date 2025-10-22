package TechnicalPrograms;

public class ReverseNum {
  public static void main(String[] args) {
  int  number=1234;
  int output=0;
  int reminder=0;

    System.out.println("INPUT:"+number);
    for (int i = 1; i <= 4; i++) {
      reminder = number % 10;
      output = output * 10 + reminder;
      number = number % 10;
      System.out.println("OUTPUT:" + output);
}
        }
    }
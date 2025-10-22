package MethodDetails;

public class PatternFun2 {
  static int pattern(int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
      }
return n--;

}

  public static void main(String[] args) {
pattern(5);
  }
  }






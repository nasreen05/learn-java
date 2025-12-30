package oops.methodConcept.basicProgram;

public class MultiplicationTable {
  static int multiplication(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.format("%d x %d =%d\n", n, i, n * i);
}
      return n;
    }


  public static void main(String[] args) {
     multiplication(7);
  }
}


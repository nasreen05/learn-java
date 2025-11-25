// write a program  to sum first n  even numbers using while loop


package basic.controlStatement.TechnicalControlStatementPro;

public class Exercise3 {
  public static void main(String[] args) {
    int sum = 0;
    int n = 3;
    for (int i=0; i<n; i++) {
      sum = sum + (2 * i);
      }
    System.out.println("Sum of the even number");
      System.out.println(sum);
    }

    }
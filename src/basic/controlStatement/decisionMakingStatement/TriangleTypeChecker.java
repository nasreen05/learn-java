package basic.controlStatement.decisionMakingStatement;

public class TriangleTypeChecker {
  public static void main(String[] args) {
    int a = 5;
    int b = 5;
    int c = 7;

    if (a + b > c) {
      if (b + c > a) {
        if (c + b > a) {

          if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
          } else {
            if (a == b || b == c || c == a) {
              System.out.println("Isosceles Triangle");
            } else {
              System.out.println("Scalence Triangle");
            }
          }
        }
      }
    }
  }
     }

package basic.controlStatement.decisionMakingStatement;

public class GradeCalculator {
  public static void main(String[] args) {
    int score = 59;
    if (score >= 56 && score <= 60) {
      System.out.println("fail");
    } else if (score >= 60 && score <= 69) {
      System.out.println("D");
    } else if (score >= 70 && score <= 79) {
      System.out.println("C");
    } else if (score >= 80 && score <= 89) {
      System.out.println("B");
    } else if (score >= 90 && score <= 100) {
      System.out.println("A");
    } else {
      System.out.println(" U r Failed");
    }
  }
        }

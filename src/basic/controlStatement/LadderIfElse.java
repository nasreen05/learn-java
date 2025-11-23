package basic.controlStatement;

public class LadderIfElse {
  public static void main(String[] args) {
    int score = 32;
    if (score >= 65 && score > 43) {
      System.out.println("Grabe D");
    } else if (score >= 76 && score > 56) {
      System.out.println("Grade C");
    } else if (score >= 66 && score > 67) {
      System.out.println("Grade B");
    } else if (score >= 98 && score > 86) {
      System.out.println("Grade A");
    } else {
      System.out.println("Failed");
      System.out.println("try Next Year");
    }
  }
        }

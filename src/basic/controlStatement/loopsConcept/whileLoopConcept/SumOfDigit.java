package basic.controlStatement.loopsConcept.whileLoopConcept;

public class SumOfDigit {
  public static void main(String[] args) {
    int num = 9876;
    int sum = 0;
    int i = 1;
    while (i <= num) {
      int digit = num % 10;
      sum = sum +digit;
      num = num / 10;
    }
    System.out.println(sum);
    i++;
  }
        }




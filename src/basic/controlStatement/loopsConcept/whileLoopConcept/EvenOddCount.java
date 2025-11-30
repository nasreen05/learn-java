package basic.controlStatement.loopsConcept.whileLoopConcept;

public class EvenOddCount {
  public static void main(String[] args) {
    int num = 1;
    int i = 1;
    while (i <= 10) {
      if (num % 2 == 0) {

        System.out.println("Print even" + num);
      } else {
        System.out.println("Odd Number" + num);
      }
      num++;

      i++;
    }
}
    }


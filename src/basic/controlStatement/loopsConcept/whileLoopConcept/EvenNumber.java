package basic.controlStatement.loopsConcept.whileLoopConcept;

public class EvenNumber {
  public static void main(String[] args) {
    int num = 20;
    int i = 1;
    while (i <= 20) {
      if (i % 2 == 0) {
        System.out.println("even number"+i);

      }
      i++;
    }
  }
}

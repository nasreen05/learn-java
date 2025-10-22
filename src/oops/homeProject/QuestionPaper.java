package HomeProject;

import java.util.Scanner;

public class QuestionPaper {

  static void msq(String[] questions, int[] answers) {
    Scanner sc = new Scanner(System.in);
    int score = 0;
    int marks = 5;
    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);
      System.out.print("Your answer: ");
      int userAnswer = sc.nextInt();

      if (userAnswer == answers[i]) {
        System.out.println("Correct");
        score += marks;
      } else {
        System.out.println(" Wrong");
        //   int totalMarks = questions.length * marks;
      }
    }
    int totalMarks = questions.length * marks;
    System.out.println("Your Total Score: " + score + " " + totalMarks);
  }
}

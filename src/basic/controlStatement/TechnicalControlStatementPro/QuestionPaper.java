package basic.controlStatement.TechnicalControlStatementPro;

import java.util.Scanner;

public class QuestionPaper {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Choose the Subject : 1.Java , 2.Html , 3.SQL");
    int subject = sc.nextInt();

    int score = 0;
    int marks = 5;

    if (subject == 1) {
      QuestionAnswer.javaQuesion();
    } else if (subject == 2) {
        QuestionAnswer.sqlQuestion();
    } else if (subject == 3) {
      String[] questions = {
        "Q1. Which SQL keyword is used to fetch data?\n1. GET  2. SELECT  3. FETCH  4. SHOW",
        "Q2. Which command is used to remove a table?\n1. DELETE  2. DROP  3. REMOVE  4. ERASE",
        "Q3. Which SQL clause is used for filtering?\n1. WHERE  2. ORDER BY  3. GROUP BY  4. HAVING"
      };

      int[] answers = {2, 2, 1};
      for (int i = 0; i < questions.length; i++) {
        System.out.println(questions[i]);
        System.out.print("Your answer: ");
        int userAnswer = sc.nextInt();

        if (userAnswer == answers[i]) {
          System.out.println("Correct");
          score += marks;
        } else {
          System.out.println(" Wrong");
        }
      }
    }
      int totalMarks = 3 * marks;
      System.out.println("Your Total Score: " + score + " " + totalMarks);
    sc.close();
  }
}

package basic.array;

import java.util.Scanner;

public class ArrayProgram {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
              String[] questions = {
                      "1) Capital of India? 1. Mumbai  2. Delhi  3. Chennai  4. Kolkata",
                      "2) Largest planet? 1. Earth  2. Mars  3. Jupiter  4. Venus",
                      "3) 2 + 2 = ? 1. 3  2. 4  3. 5  4. 6"
              };

              int[] answers = {2, 3, 2};
              int  marks= 5;
              int score=0;




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
     int totalMarks = questions.length * marks;
      System.out.println("Your Total Score: " + score  + " "+totalMarks);

              sc.close();
          }
      }



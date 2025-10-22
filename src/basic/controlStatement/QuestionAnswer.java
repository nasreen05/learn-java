package basic.controlStatement;

import java.util.Scanner;

public class QuestionAnswer {
    static void javaQuesion(){
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int marks = 5;
        String[] questions = {
                "Q1. Which keyword is used to inherit a class in Java?\n1. this  2. super  3. extends  4. implements",
                "Q2. Which of these is not a primitive type?\n1. int  2. float  3. boolean  4. String",
                "Q3. Which method is the entry point in Java?\n1. start()  2. main()  3. run()  4. execute()"
        };

        int[] answers = {3, 4, 1};
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
    static void sqlQuestion(){
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int marks = 5;
        String[] questions = {
                "Q1. Which tag is used for largest heading?\n1. <h1>  2. <h6>  3. <head>  4. <title>",
                "Q2. Which tag is used for line break?\n1. <p>  2. <br>  3. <break>  4. <lb>",
                "Q3. Which attribute is used for image path?\n1. href  2. src  3. alt  4. link"
        };

        int[] answers = {1, 2, 2};
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

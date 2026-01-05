package basic.homeProject;


import java.util.Scanner;

public class ChooseSub {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose your subject:");
            System.out.println("1. Java");
            System.out.println("2. HTML");
            System.out.println("3. SQL");
            System.out.print("Enter your choice: ");

            int userChoice = sc.nextInt();

            if (userChoice==1){
                String[] questions = {
                        "Q1. Which keyword is used to inherit a class in Java?\n1. this  2. super  3. extends  4. implements",
                        "Q2. Which of these is not a primitive type?\n1. int  2. float  3. boolean  4. String",
                        "Q3. Which method is the entry point in Java?\n1. start()  2. main()  3. run()  4. execute()"
                };

                int[] answers = {3, 4, 1};
                QuestionPaper.msq(questions, answers);
            } else if(userChoice==2){
                String[] questions = {
                        "Q1. Which tag is used for largest heading?\n1. <h1>  2. <h6>  3. <head>  4. <title>",
                        "Q2. Which tag is used f.or line break?\n1. <p>  2. <br>  3. <break>  4. <lb>",
                        "Q3. Which attribute is used for image path?\n1. href  2. src  3. alt  4. link"
                };

                int[] answers = {1, 2, 2};
                QuestionPaper.msq(questions, answers);
            } else {

            }
        }
    }





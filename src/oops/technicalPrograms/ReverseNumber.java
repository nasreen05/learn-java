package TechnicalPrograms;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 1234;
        int output = 0;
        System.out.println("Input:" + number);


        for (int i=1; i<=4; i++) {
            int reminder = number % 10;
            output = output * 10 + reminder;
            number = number / 10;

        }
        System.out.println("Output:"+ output);

        }
    }





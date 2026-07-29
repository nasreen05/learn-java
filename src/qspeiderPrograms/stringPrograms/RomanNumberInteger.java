package qspeiderPrograms.stringPrograms;


class InvalidInputException extends RuntimeException {

    InvalidInputException(String msg) {
        super(msg);
    }
}

public class RomanNumberInteger {

    public static int romanToIndian(char ch) {

        switch (ch) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                throw new InvalidInputException(
                        "The characters that you have provide is invalid as a roman");
        }
    }

    public static void main(String[] args) {

        String str = "mcdlxxviii";
        str = str.toUpperCase();

        int current = romanToIndian(str.charAt(str.length() - 1));
        int total = current;

        for (int i = str.length() - 1; i > 0; i--) {

            int prev = romanToIndian(str.charAt(i - 1));

            if (prev < current) {
                total -= prev;
            } else {
                total += prev;
            }

            current = prev;
        }

        System.out.println(total);
    }
}
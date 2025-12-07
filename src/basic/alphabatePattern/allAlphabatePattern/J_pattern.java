package basic.alphabatePattern.allAlphabatePattern;

public class J_pattern {
       public static void main(String[] args) {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= 7; j++) {
                    if (i == 1 ||
                            j == 4 ||
                            (i == 7 && j >= 2 && j <= 5) ||
                            (j == 2 && i >= 5))
                    {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }


package basic.alphabatePattern.allAlphabatePattern;

public class Q_pattern {
      public static void main(String[] args) {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= 7; j++) {
                    if ((i == 1 && j > 1 && j < 6) ||
                            (i == 6 && j > 1 && j < 6) ||
                            (j == 1 && i > 1 && i < 6) ||
                            (j == 6 && i > 1 && i < 6) ||
                            (i == j && i >= 4))
                        System.out.print("+");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }



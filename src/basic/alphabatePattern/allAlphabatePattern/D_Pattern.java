package basic.alphabatePattern.allAlphabatePattern;

public class D_Pattern {
        public static void main(String[] args) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if (j == 2 || (i == 1 && j < 7) || (i == 9 && j < 7) || (j == 7 && i > 1 && i < 9)) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

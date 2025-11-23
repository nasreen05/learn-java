package basic.alphabatePattern;

public class AlphaPattern13 {
    public static void main(String[] args){
        int n = 6;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        char ch;
                        if (j == 1 || j == i)
                            ch = (char) ('A' + i - 1);
                        else
                            ch = (char) ('A' + j - 1);
                        System.out.print(ch);
                    }
                    System.out.println();
                }
            }
        }

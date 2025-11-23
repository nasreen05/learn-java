package basic.alphabatePattern;

public class AlphaPattern11 {
    public static void main(String[] args){
                int n = 6;
                for (int i = 1; i <= n; i++) {
                    for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) {
                        System.out.print(ch);
                    }
                    System.out.println();
                }
            }
        }

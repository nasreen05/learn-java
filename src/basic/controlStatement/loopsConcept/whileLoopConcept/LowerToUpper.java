package basic.controlStatement.loopsConcept.whileLoopConcept;

    import java.util.*;

    public class LowerToUpper {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String result = "";

            int i = 0;
            while (i < s.length()) {
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'z')
                    result += (char)(ch - 32);
                else
                    result += ch;
                i++;
            }
            System.out.println(result);
        }
    }

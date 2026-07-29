package qspeiderPrograms.stringPrograms;

public class CountUpperLowerDigitsSpecialChar {
    public static void main(String[] args) {

        String s = "abcDEF123$_9";

        int cu = 0, cl = 0, cn = 0, cs = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                cl++;
            }
            else if (ch >= 'A' && ch <= 'Z') {
                cu++;
            }
            else if (ch >= '0' && ch <= '9') {
                cn++;
            }
            else {
                cs++;
            }
        }

        System.out.println("Lowercase = " + cl);
        System.out.println("Uppercase = " + cu);
        System.out.println("Digits = " + cn);
        System.out.println("Special Characters = " + cs);
    }
}


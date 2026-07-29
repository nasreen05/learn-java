package qspeiderPrograms.stringPrograms;

public class LargestSubString {
    public static void main(String[] args) {
        String s = "Nasreen The One";

        String[] str = s.split(" ");

        int max = 0;

        for (int i = 0; i < str.length; i++) {

            if (max <= str[i].length()) {
                max = str[i].length();
            }
        }

        for (int i = 0; i < str.length; i++) {

            if (max == str[i].length()) {
                System.out.println(str[i]);
            }
        }
    }
}

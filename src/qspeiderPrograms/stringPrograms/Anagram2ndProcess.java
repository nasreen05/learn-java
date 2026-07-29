package qspeiderPrograms.stringPrograms;

import java.util.Arrays;

public class Anagram2ndProcess {
    public static void main(String[] args) {
            String s1 = "Listen";
            String s2 = "Silent";

            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            s1 = new String(ch1);
            s2 = new String(ch2);

            System.out.println(s1.equals(s2) ? "Anagram" : "Not");
        }
    }

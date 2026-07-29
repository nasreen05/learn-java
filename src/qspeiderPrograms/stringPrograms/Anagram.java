package qspeiderPrograms.stringPrograms;

public class Anagram {
        public static void main(String[] args) {

            String s1 = "Eagle";
            String s2 = "Angle";

            if (s1.length() == s2.length()) {

                s1 = s1.toLowerCase();
                s2 = s2.toLowerCase();

                int c1 = 0, c2 = 0;

                for (int i = 0; i < s1.length(); i++) {

                    if (s1.contains(s2.charAt(i) + "")) {
                        c1++;
                    }

                    if (s2.contains(s1.charAt(i) + "")) {
                        c2++;
                    }
                }

                System.out.println(
                        c1 == s1.length() && c2 == s1.length()
                                ? "Anagram"
                                : "Not an Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }
    }
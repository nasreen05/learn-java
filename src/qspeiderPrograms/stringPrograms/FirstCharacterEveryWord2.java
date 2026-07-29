package qspeiderPrograms.stringPrograms;

public class FirstCharacterEveryWord2 {
     public static void main(String[] args) {

            String s = "I Love Java";

            System.out.println(s.charAt(0));

            for (int i = 1; i < s.length(); i++) {

                if (s.charAt(i) == ' ') {
                    System.out.println(s.charAt(i + 1));
                }
            }
        }
    }
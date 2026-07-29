package qspeiderPrograms.stringPrograms;

public class FirstCharacterEveryWord {
     public static void main(String[] args) {

            String s = "I love Manual";

            String[] str = s.split(" ");

            for (int i = 0; i < str.length; i++) {

                if (str[i].charAt(0) == ' ') {
                    System.out.println(str[i].charAt(1));
                } else {
                    System.out.println(str[i].charAt(0));
                }
            }
        }
    }

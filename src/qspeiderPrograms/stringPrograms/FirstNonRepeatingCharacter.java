package qspeiderPrograms.stringPrograms;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String s = "jjjjjbanarjee";

        for (int i = 0; i < s.length(); i++) {

            int count = 1;

            if (s.charAt(i) != ' ') {

                for (int j = i+2; j < s.length(); j++) {

                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                    }
                }

                if (count == 1) {
                    System.out.println("First Non-Repeating Character : " + s.charAt(i));
                    break;
                }
            }
        }
    }
}
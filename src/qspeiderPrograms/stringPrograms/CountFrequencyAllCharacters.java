package qspeiderPrograms.stringPrograms;

public class CountFrequencyAllCharacters {
    public static void main(String[] args) {
        String s = "Satya Rayan";

        for (int i = 0; i < s.length(); i++) {

            int count = 1;

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    s = s.replace(s.charAt(j), ' ');
                }
            }

            if (s.charAt(i) != ' ') {
                System.out.println(s.charAt(i) + " = " + count);
            }
        }
    }
}

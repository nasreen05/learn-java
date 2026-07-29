package qspeiderPrograms.stringPrograms;

public class MissingCharSeq {
    public static void main(String[] args) {

        String str = "Chai";
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {

            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);

            if (c1 == c2) {
                continue;
            }

            while (c1 < c2 - 1) {
                System.out.println(++c1);
            }

            while (c1 > c2 + 1) {
                System.out.println(--c1);
            }

            System.out.println("***");
        }
    }
}
package qspeiderPrograms.stringPrograms;

public class StringSortedORNot {
    public static void main(String[] args) {

        String s = "abcdef";

        s = s.toLowerCase();

        int as = 0, des = 0, same = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) < s.charAt(i + 1)) {
                as++;
            }
            else if (s.charAt(i) > s.charAt(i + 1)) {
                des++;
            }
            else {
                same++;
            }
        }

        if (same + as == s.length() - 1) {
            System.out.println("Ascending Order");
        }
        else if (same + des == s.length() - 1) {
            System.out.println("Descending Order");
        }
        else {
            System.out.println("Random Order");
        }
    }
}

package qspeiderPrograms.stringPrograms;

public class AlphabetsPresent {
    public static void main(String[] args) {
    int count=0;
    String s= "abcd12cf78g9$?HG";
    for (int i = 0; i < s.length(); i++) {
        if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
            count++;
        }
    }

    System.out.println("Count of alphabets: " + count);
}
}

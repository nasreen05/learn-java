package TechnicalPrograms;

class PalindromString {
    public static void main(String[] args) {
        String name = "mam";
        String out = "";

        out = out + name.charAt(2);
        out = out + name.charAt(1);
        out = out + name.charAt(0);

        System.out.println(out);
    }
}

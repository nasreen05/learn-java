package TechnicalPrograms;

public class PalindromString2 {
    public static void main(String[] args){

        String name="MADAM";
        String out = "";

        out=out+name.charAt(4);
        out=out+name.charAt(3);
        out=out+name.charAt(2);
        out=out+name.charAt(1);

        System.out.println(out);

    }
}

package qspeiderPrograms.stringPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        String s="aba";
        StringBuffer sb= new StringBuffer();
        for(int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
        String str=sb.toString();
        if(s.equalsIgnoreCase(str))
            System.out.println("Palindorme ");
            else
            System.out.println("Not Palindrome");
    }
    }


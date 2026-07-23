package qspeiderPrograms.stringPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String s="abcedf";
        StringBuffer sb= new StringBuffer();
        for(int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
            String str = sb.toString();
        System.out.println(str);
        }
    }


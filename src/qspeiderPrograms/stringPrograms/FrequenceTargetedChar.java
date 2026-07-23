package qspeiderPrograms.stringPrograms;

public class FrequenceTargetedChar {
    public static void main(String[] args) {
        String s="banana";
        int count=0;
        char l='a';
        for(int i=0;i<s.length();i++){
            if(l==s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}

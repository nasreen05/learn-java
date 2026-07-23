package qspeiderPrograms.stringPrograms;

public class CountVowels {
    public static void main(String[] args) {
        String vowel="aeiouAEIOU";
        int count=0;
        String s="abcd12cf48gh9&?HGIOU";
        for(int i=0;i<s.length();i++){
            if(vowel.contains(s.charAt(i)+"")){
                count++;
            }
        }
        System.out.println(count);
    }
}

package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class CountVowelsStringUsing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int i=0;
        int count=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
            i++;
        }
        System.out.println("Vowels: " + count);
    }
    }

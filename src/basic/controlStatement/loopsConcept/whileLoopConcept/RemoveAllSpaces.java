package basic.controlStatement.loopsConcept.whileLoopConcept;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class RemoveAllSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result="";

        int i=0;
        while(i<s.length()){
            if(s.charAt(i) != ' ')
                result +=s.charAt(i);
                 i++;
        }
        System.out.println(result);
    }
}

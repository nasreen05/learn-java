package MethodDetails;

public class PatternRecursion {
    static void patternRec(int n){

        if(n>0){
            patternRec(n-1);
            for(int i=0;i< n;i++){
        System.out.print("*");
            }
      System.out.println();
        }
    }
public static void main(String[] args){
    System.out.println();
    patternRec(5);
}
}

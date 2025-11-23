package oops.technicalPrograms;

public class StarPatternRec {
  static int patternRec(int n) {
      if(n>0){
      patternRec(n-1);
      for(int i=0;i<n;i++){
        System.out.print("*");
      }
      System.out.println();
      }
      return n;
      }
      public static void main(String[] args){
    System.out.println();
  patternRec(5);
  }
  }
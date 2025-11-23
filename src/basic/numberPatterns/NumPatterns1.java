package basic.numberPatterns;

public class NumPatterns1 {
    public static void main(String[] args){
      int row=5;
      int star=1;
      for(int r=1;r<=row;r++){
          int num=1;
          for(int s=1;s<=star;s++){
        System.out.print(num+" ");
        num++;
          }
      System.out.println();
          star++;
      }
    }
}

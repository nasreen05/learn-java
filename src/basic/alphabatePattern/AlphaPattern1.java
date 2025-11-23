package basic.alphabatePattern;

public class AlphaPattern1 {
public static void main(String[] args){
  int row=6;
  for(int r=1;r<=row;r++){
      char ch='A';
      for(int s=1;s<=r;s++){
        System.out.print(ch+" ");
      ch++;
      }
      System.out.println();
  }
}
}

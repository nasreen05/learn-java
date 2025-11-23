package basic.alphabatePattern;

public class AlphaPattern3 {
    public static void main(String[] args){
      int row=11;
      int star=1;


      for(int r=1;r<=row;r++){
          char ch='A';
          for(int s=1;s<=star;s++){
        System.out.print(ch+" ");
        ch++;
          }
      System.out.println();
          if(r<=row/2){
              star++;
          }else{
              star--;
          }
      }
    }
}

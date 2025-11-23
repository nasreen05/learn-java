package basic.alphabatePattern;

public class AlphaPattern10 {
    public static void main(String[] args){
        int row=6;
        int  star=1;
        char ch='A';
        for(int r=1;r<=row;r++){
            for(int s=1;s<=star;s++){
        System.out.print(ch+" ");
           ch++;
            }
      System.out.println();
            star++;
        }
    }
}

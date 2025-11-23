package basic.alphabatePattern;

public class AlphaPattern6 {
    public static void main(String[] args){
        int row=6;
        int star=1;

        for(int r=0;r<=row;r++){
            char ch='A';
            for(int s=1;s<=star;s++){
System.out.print(ch+" ");
        ch++;
            }
      System.out.println();
            star++;

        }
    }
}

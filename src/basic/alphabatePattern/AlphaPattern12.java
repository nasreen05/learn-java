package basic.alphabatePattern;

public class AlphaPattern12 {
    public static void main(String[] args){
        int row=6;
        int star=1;

        for(int r=1;r<=row;r++){
            char ch=(char)('A' + r - 1);
            for(int s=1;s<=star;s++){
        System.out.print(ch+" ");
        ch+=5;

            }
      System.out.println();
            star++;
        }
    }
}

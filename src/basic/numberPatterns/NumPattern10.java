package basic.numberPatterns;

public class NumPattern10 {
    public static void main(String[] args){
        int row=5;
        int star=1;
        int num=1;
        for(int r=1;r<=row;r++){
            for(int s=1;s<=star;s++){
        System.out.print(num+" ");
        num++;
            }
      System.out.println();
            star++;
        }
    }
}

package basic.numberPatterns;

public class NumPattern2 {
    public static void main(String[] args){
        int row=6;
        int star=1;
        int num=1;
        for(int r=1;r<=row;r++){
            for(int s=1;s<=star;s++){
        System.out.print(num+" ");
            }
      System.out.println();
            star++;
            num++;
        }
    }
}

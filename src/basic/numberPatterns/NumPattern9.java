package basic.numberPatterns;

public class NumPattern9 {
    public static void main(String[] args){
        int row=6;
        int star=6;
        for(int r=1;r<=row;r++){
            int num=1;
            for(int s=1;s<=star;s++){
        System.out.print(num+" ");
            num++;
            }
      System.out.println();
            star--;
        }
    }
}

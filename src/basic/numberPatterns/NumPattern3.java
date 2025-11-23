package basic.numberPatterns;

public class NumPattern3 {
    public static void main(String[] args){
        int row=11;
        int star=1;
        for(int r=1;r<=row;r++){
            int num=1;
            for(int s=1;s<=star;s++){
        System.out.print(num+" ");
        num++;

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

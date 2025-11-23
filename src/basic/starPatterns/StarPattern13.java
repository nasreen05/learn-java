package basic.starPatterns;

public class StarPattern13 {
    public static void main(String[] args){
        int row=9;
        int  star=5;
        int spc=1;

        for(int r=1;r<=row;r++){
            for(int s=1;s<=spc;s++){
                System.out.print(" ");
            }
            for(int i=1;i<=star;i++){
                System.out.print("*");
            }
            System.out.println();
            if(r<=row/2){
                star--;
                spc++;
            }else{
                star++;
                spc--;

            }
        }
    }
}

package basic.starPatterns;

public class StarPattern5 {
    public static void main(String[] args){
        int row=3;
        int spc=2;
        int str=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=spc;j++){
          System.out.print(" ");
          }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
                }
        System.out.println();
            spc--;
            str++;
            }
        }
    }
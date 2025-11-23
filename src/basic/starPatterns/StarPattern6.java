package basic.starPatterns;

public class StarPattern6 {
    public static void main(String[] args){
        int row=10;
        int spc=2;
        int str=9;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            System.out.println();
            spc+=2;
            str-=2;
        }
    }
}

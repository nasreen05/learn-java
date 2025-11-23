package basic.alphabatePattern;

public class AlphaPattern7 {
    public static void main(String[] args){

            int row=11;
            int star=6;
            for(int r=1;r<=row;r++){
                char ch='F';
                for(int s=1;s<=star;s++){
                    System.out.print(ch+" ");
                    ch--;

                }
                System.out.println();

                    star--;
                }
            }
        }



package basic.numberPatterns;

public class NumPattern15 {
  public static void main(String[] args) {
    int row = 6;
    int star = 5;
    int spc=0;

    for (int r = 1; r <= row; r++) {
        for(int s=1;s<=spc;s++){
        System.out.print(" ");
        }
        int num = 1;

        for (int i = 1; i <= star; i++) {
          System.out.print(num+" ");
          num++;
        }
        System.out.println();
        star--;
        spc++;

      }
    }
  }

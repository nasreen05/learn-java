package MethodDetails;
/*

*
* *
* * *
* * * *

 */
public class TechnicalProgram2 {
  public static void main(String[] args) {
    int row = 5;
    int spc = 5;
    int star = 1;

    for (int r = 1; r <= row; r++) {
      for (int s = 1; s <= spc; s++) {
        System.out.print("");
      }
      for (int i = 1; i <= star; i++) {
        System.out.print("*");
      }
      System.out.println();
      star++;
        spc--;

        }
    }
  }

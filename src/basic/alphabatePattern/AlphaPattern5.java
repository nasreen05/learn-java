package basic.alphabatePattern;

public class AlphaPattern5 {
  public static void main(String[] args) {

    int row = 11;
    int star = 6;
    char ch = 'F';
    for (int r = 1; r <= row; r++) {
      if (r <= row / 2 + 1) {
        ch = (char) ('F' - (r - 1));
      } else {
        ch = (char) ('A' + (r - (row / 2 + 1)));
      }
      for (int s = 1; s <= star; s++) {
        System.out.print(ch + " ");
        ch--;
      }
      System.out.println();
      if (r < row / 2 + 1) {
        star--;
      } else {
        star++;
      }
    }
  }
            }

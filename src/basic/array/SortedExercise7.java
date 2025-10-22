package basic.array;
// write a java program to find whether an aray is sorted or not------
public class SortedExercise7 {
  public static void main(String[] args) {
    boolean isSorted = true;
    int[] num = {34, 45, 667, 78, 98};
    for (int i = 0; i < num.length; i++)
      if (num[i] > num[i + 1]) {
        isSorted = false;
        break;
      }
    if (isSorted) {
      System.out.println("The array is sorted");
    } else {
      System.out.println("the array is not sorted");
    }
  }
    }

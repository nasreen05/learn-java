package qspeiderPrograms.ArrayPrograms;

import java.util.Arrays;

public class ShiftingZeroesToTheFirst {
  public static int[] shiftZeroes(int[] arr) {

            int nonZero = arr.length - 1;

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != 0)
                    arr[nonZero--] = arr[i];
            }

            while (nonZero >= 0) {
                arr[nonZero--] = 0;
            }

            return arr;
        }

        public static void main(String[] args) {

            int[] arr = {1, 4, 2, 3, 0, 7, 9, 0, 6, 5, 0, 8};

            System.out.println(Arrays.toString(arr));

            arr = shiftZeroes(arr);

            System.out.println(Arrays.toString(arr));
        }
    }
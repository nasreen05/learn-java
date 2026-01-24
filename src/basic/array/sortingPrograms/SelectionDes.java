package basic.array.sortingPrograms;

import java.util.Arrays;

public class SelectionDes {
    public static void main(String[] args) {
        int[] num = {2, 9, 5, 3,  4, 1, 8};
        System.out.println("Before Sorting "+ Arrays.toString(num));

        for(int i=0;i< num.length-1;i++) {

            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }
            }
        }
        System.out.println("After short:" + Arrays.toString(num));

    }
}

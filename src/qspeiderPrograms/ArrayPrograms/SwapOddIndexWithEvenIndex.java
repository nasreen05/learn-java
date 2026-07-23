package qspeiderPrograms.ArrayPrograms;

import java.util.Arrays;

public class SwapOddIndexWithEvenIndex {
    public static int[] swapping(int[] a) {

        for (int i = 1; i < a.length - 1; i++) {

            if (i % 2 != 0) {

                a[i] += a[i + 1];
                a[i + 1] = a[i] - a[i + 1];
                a[i] = a[i] - a[i + 1];
            }
        }

        return a;
    }

    public static void main(String[] args) {

        int[] a = {1, 8, 3, 6, 4, 7, 10, 9};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(swapping(a)));
    }
}
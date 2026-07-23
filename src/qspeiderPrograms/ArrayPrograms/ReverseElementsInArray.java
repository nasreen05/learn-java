package qspeiderPrograms.ArrayPrograms;

import java.util.Arrays;

public class ReverseElementsInArray {
    public static int[] reverseTheArray(int[] a) {

        int i = 0, j = a.length - 1;

        while (i < j) {

            a[i] += a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i] - a[j];

            i++;
            j--;
        }

        return a;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array :");
        System.out.println(Arrays.toString(a));

        System.out.print("Reversed Array : ");

        System.out.println(Arrays.toString(reverseTheArray(a)));
    }
}

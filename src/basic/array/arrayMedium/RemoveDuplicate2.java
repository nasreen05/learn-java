package basic.array.arrayMedium;

import java.util.Arrays;

public class RemoveDuplicate2 {
        public static void removeDuplicates(int[] a) {
            int dummy = Integer.MIN_VALUE;

            for (int i = 0; i < a.length; i++) {
                if (a[i] != dummy) {

                    for (int j = i + 1; j < a.length; j++) {

                        if (a[i] == a[j]) {
                            a[j] = dummy;
                        }
                    }
                }
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i] != dummy)
                    System.out.println(a[i]);
            }
        }

        public static void main(String[] args) {
            int[] a = { 4, 3, 2, 4, 5, 2, 0, 3, 2, 3, 4 };

            System.out.println(Arrays.toString(a));

            removeDuplicates(a);
        }
    }

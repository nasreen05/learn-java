package qspeiderPrograms.ArrayPrograms;

import java.util.Arrays;

public class ShiftingZeroesToMiddle {


        public static int[] shiftZeroesToLast(int[] a) {

            int j = 0;

            for (int i = 0; i <= a.length / 2; i++) {

                if (a[i] != 0)
                    a[j++] = a[i];
            }

            while (j <= a.length / 2)
                a[j++] = 0;

            return a;
        }

        public static int[] shiftZeroesToFirst(int[] a) {

            int k = a.length - 1;

            for (int i = a.length - 1; i >= a.length / 2 + 1; i--) {

                if (a[i] != 0)
                    a[k--] = a[i];
            }

            while (k >= a.length / 2 + 1)
                a[k--] = 0;

            return a;
        }

        public static void main(String[] args) {

            int[] a = {1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6};

            System.out.println(Arrays.toString(a));

            a = shiftZeroesToFirst(a);
            a = shiftZeroesToLast(a);

            System.out.println(Arrays.toString(a));
        }
    }

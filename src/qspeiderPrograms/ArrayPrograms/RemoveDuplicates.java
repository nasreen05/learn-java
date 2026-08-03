package qspeiderPrograms.ArrayPrograms;

import java.util.Arrays;

public class RemoveDuplicates {
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

            System.out.println("After removing duplicates:");
            for (int i = 0; i < a.length; i++) {
                if (a[i] != dummy) {
                    System.out.print(a[i] + " ");
                }
            }
        }

        public static void main(String[] args) {
            int[] a = {4,3,2,4,5,2,0,3,2,3,4};
            System.out.println(Arrays.toString(a));
            removeDuplicates(a);
        }
    }

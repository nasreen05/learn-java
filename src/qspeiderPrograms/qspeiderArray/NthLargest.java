package qspeiderPrograms.qspeiderArray;

import java.util.Scanner;

public class NthLargest {

        public static int nthLargest(int[] a, int n) {

            if (n > a.length || n < 1)
                return -1;

            int dummy = Integer.MIN_VALUE, max = dummy;

            // to control nth count
            for (int j = 1; j <= n; j++) {

                // find largest
                max = dummy;

                for (int i = 0; i < a.length; i++) {
                    if (max < a[i] && a[i] != dummy) {
                        max = a[i];
                    }
                }

                // remove all largest elements
                for (int i = 0; i < a.length; i++) {
                    if (max == a[i]) {
                        a[i] = dummy;
                    }
                }
            }

            return max;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int size = sc.nextInt();

            int[] a = new int[size];

            for (int i = 0; i < a.length; i++) {
                System.out.println("Provide the size of the array");
                a[i] = sc.nextInt();
            }

            System.out.println("Provide which largest element you want to find");
            int nth = sc.nextInt();

            System.out.println("The " + nth +
                    "th largest element is : " + nthLargest(a, nth));
        }
    }

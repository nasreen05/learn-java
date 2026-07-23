package qspeiderPrograms.ArrayPrograms;

public class CountDuplicates {

        public static int duplicateElements(int[] a) {
            int duplicates = 0;

            for (int i = 0; i < a.length; i++) {
                int count = 0;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j] && a[i] != Integer.MIN_VALUE) {
                        count++;
                        a[j] = Integer.MIN_VALUE;
                    }
                }

                if (count > 0 && a[i] != Integer.MIN_VALUE) {
                    System.out.println(a[i]);
                    duplicates++;
                }
            }

            return duplicates;
        }

        public static void main(String[] args) {
            int[] a = {6, 7, 8, 4, 3, 2, 10, 0, 8, 20, 6, 7, 3, 0, 20, 9, 1};

            System.out.println("Number of duplicate elements : "
                    + duplicateElements(a));
        }
    }
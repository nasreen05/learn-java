package qspeiderPrograms.qspeiderArray;

public class UniqueElementCount {
    public static int uniqueElement(int[] a) {

        int unique = 0;

        for (int i = 0; i < a.length; i++) {

            int duplicates = 0;

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j] && a[i] != Integer.MIN_VALUE) {
                    duplicates++;
                    a[j] = Integer.MIN_VALUE;
                }
            }

            if (duplicates == 0 && a[i] != Integer.MIN_VALUE) {
                System.out.println(a[i]);
                unique++;
            }
        }

        return unique;
    }

    public static void main(String[] args) {

        int[] a = {6, 7, 8, 4, 3, 2, 10, 77, 3, 8, 20, 9};

        System.out.println("Number of unique element : "
                + uniqueElement(a));
    }
}

package qspeiderPrograms.qspeiderArray;

public class HighestRepeatedElement {
    public static void highestRepeatedElement(int[] a) {

        int highestRepeated = a[0];
        int highestCount = 0;

        for (int i = 0; i < a.length; i++) {

            int count = 1;

            for (int j = i + 1;
                 j < a.length && a[i] != Integer.MIN_VALUE;
                 j++) {

                if (a[i] == a[j]) {
                    count++;
                    a[j] = Integer.MIN_VALUE;
                }
            }

            if (highestCount < count &&
                    a[i] != Integer.MIN_VALUE) {

                highestCount = count;
                highestRepeated = a[i];
            }
        }

        System.out.println(highestRepeated + " : " + highestCount);
    }

    public static void main(String[] args) {

        int[] a = {
                1, 5, 7, 8, 4, 1, 7, 8,
                4, 6, 9, 4, 1, 9,
                8, 4, 1, 4, 8
        };

        highestRepeatedElement(a);
    }
}
package qspeiderPrograms.qspeiderArray;

public class MargeTwoArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6, 7, 8};
        int[] a3 = new int[a1.length + a2.length];
        int j = 0;
        for (int i = 0; i < a3.length; i++) {
            if (i < a1.length) {
                a3[i] = a1[i];
            } else {
                a3[i] = a2[j++];
            }
        }

        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
    }
}
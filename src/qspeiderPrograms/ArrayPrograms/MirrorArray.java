package qspeiderPrograms.ArrayPrograms;

public class MirrorArray {
    public static boolean checkMirror(int[] a) {

        if (a.length % 2 != 0)
            return false;

        else {

            int i = 0, j = a.length - 1;

            while (i < j) {

                if (a[i] != a[j]) {
                    return false;
                }

                i++;
                j--;
            }

            return true;
        }
    }

    public static void main(String[] args) {

     //   int[] a = {1, 2, 3, 3, 2, 1, 0};


        int[] a = {1, 2, 3, 3, 2, 1};
        if (checkMirror(a))
            System.out.println("Mirror Array");
        else
            System.out.println("Not mirror array");
    }
}
package qspeiderPrograms.qspeiderArray;


public class SortedOrNot {
    public static void main(String[] args) {
        int arr[]={11,8,5,6,9};
        int asc = 0;
        int dec = 0;
        int eq = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                asc++;
            } else if (arr[i] > arr[i + 1]) {
                dec++;
            } else {
                eq++;
            }
        }
        if (eq + asc == arr.length - 1)
            System.out.println("Ascending Order ");
        else if (eq + dec == arr.length - 1)
            System.out.println("Descending Order ");
        else
            System.out.println("Not Sorted");
    }
}

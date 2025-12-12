package basic.array.arrayEasy;

public class CountNegativeElement {
       public static void main(String[] args) {
            int[] arr = {10, -5, 7, -3, -8};

            int count = 0;
            for (int x : arr) if (x < 0) count++;

            System.out.println("Total Negative Elements = " + count);
        }
    }


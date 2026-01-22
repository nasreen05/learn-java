package basic.array.array2D;

public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };

        int sum = 0;
        for (int[] row : arr) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("Sum = " + sum);
    }
}

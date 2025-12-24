package basic.array.arrayAdvance;

class AscendingOrder{
    public static void main(String[] args) {
        int[] arr = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};
        int temp;

        // Sort using for loops
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
package basic.array.arrayAdvance;

class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int largest = arr[0];
        int secondLargest = arr[1];

        for (int num = 0; num<arr.length; num++) {
            if (arr[num] > largest) {
                secondLargest = largest;
                largest = arr[num];
                // else if (arr[num] > secondLargest )  or
            } else if (arr[num] > secondLargest && arr[num] != largest) {
                secondLargest = arr[num];
            }
        }

        // if (secondLargest == arr[1]) {
            // System.out.println("No second largest number found");
        // } else {
            System.out.println("Second largest number is: " + secondLargest);
        // }
    }
}
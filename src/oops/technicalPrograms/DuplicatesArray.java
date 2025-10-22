package TechnicalPrograms;

public class DuplicatesArray {

        public static void main(String[] args) {
            int[] arr = {2, 4, 5, 2, 7, 8, 4, 9, 5};

            System.out.println("Duplicate elements in array:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }


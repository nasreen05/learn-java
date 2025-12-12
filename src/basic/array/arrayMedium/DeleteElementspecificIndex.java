package basic.array.arrayMedium;

public class DeleteElementspecificIndex {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int index = 2;

            int[] newArr = new int[arr.length - 1];

            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i == index) continue;
                newArr[j++] = arr[i];
            }

            for (int x : newArr) System.out.print(x + " ");
        }
    }



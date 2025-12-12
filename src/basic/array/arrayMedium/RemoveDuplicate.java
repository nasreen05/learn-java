package basic.array.arrayMedium;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] num = {2, 3, 3, 2, 4, 5, 6, 5};
        int n = args.length;
        System.out.println("After the duplicate Value :");
        for (int i = 0; i < num.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (num[j] == num[i]) {
                    isDuplicate = true;
                    break;

                }
            }
            if (!isDuplicate) {
                System.out.println(num[i] + " ");

            }
        }
    }
}

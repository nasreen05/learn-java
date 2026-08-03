package qspeiderPrograms.numberPrograms;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int product = 1;

        while (num != 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }

        System.out.println("Product of digits: " + product);
    }

}

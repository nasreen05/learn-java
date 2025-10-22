package oops.arrayAdvance;

class SumPower1{
    public static void main(String[] args) {
        int num = 153;   
        int temp = num;
        int count = 0;

        
        int n = num;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;

            int j = 1, power = 1;
            while (j <= count) {
                power = power * digit;
                j++;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        System.out.println("Number: " + num);
        System.out.println("Sum of power of digits = " + sum);
    }
}

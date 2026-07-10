package programmingClass.ArmstrongPrograms;

public class CheckArmStrong {

        public static void main(String[] args) {
            int n = 153;

            if (isArmStrongNumber(n))
                System.out.println(n + " is Armstrong Number");
            else
                System.out.println(n + " is Not Armstrong Number");
        }

        static boolean isArmStrongNumber(int n) {
            int count = digitsInNumber(n);
            int originalNum = n;
            int sum = 0;

            while (n != 0) {
                int dig = n % 10;
                sum = sum + raiseToPower(dig, count);
                n /= 10;
            }

            return originalNum == sum;
        }

        private static int raiseToPower(int dig, int count) {
            int pow = 1;
            for (int i = 1; i <= count; i++) {
                pow = pow * dig;
            }
            return pow;
        }

        private static int digitsInNumber(int n) {
            int count = 0;
            while (n != 0) {
                count++;
                n /= 10;
            }
            return count;
        }
    }
package programmingClass.ArmstrongPrograms;

public class NthNextArmstrongNum {

        public static void main(String[] args) {
            System.out.println(nextNthArmStrong(153, 3));
        }

        private static int nextNthArmStrong(int n, int nth) {
            int count = 0;

            while (true) {
                n++;

                if (isArmStrongNumber(n))
                    count++;

                if (count == nth)
                    return n;
            }
        }

        private static boolean isArmStrongNumber(int n) {
            int count = digitsInNumber(n);
            int originalNum = n;
            int sum = 0;

            while (n != 0) {
                int dig = n % 10;
                sum += raiseToPower(dig, count);
                n /= 10;
            }

            return originalNum == sum;
        }

        private static int raiseToPower(int dig, int count) {
            int pow = 1;
            for (int i = 1; i <= count; i++)
                pow *= dig;
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

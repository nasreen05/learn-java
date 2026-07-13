package programmingClass.ArmstrongPrograms;

import static programmingClass.ArmstrongPrograms.CheckArmStrong.isArmStrongNumber;

public class SumArmNumRange {
    public static void main(String[] args) {
        sumOfArmStrongInRange(100, 500);
    }

    private static void sumOfArmStrongInRange(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isArmStrongNumber(i))
                sum += i;
        }

        System.out.println(sum);
    }

    // Same helper methods
}
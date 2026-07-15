package qspeiderPrograms.ArmstrongPrograms;

import static qspeiderPrograms.ArmstrongPrograms.CheckArmStrong.isArmStrongNumber;

public class CountArmNumRange {
    public static void main(String[] args) {
        countOfArmStrongInRange(100, 500);
    }

    private static void countOfArmStrongInRange(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isArmStrongNumber(i))
                count++;
        }

        System.out.println(count);
    }

    // Same helper methods
}

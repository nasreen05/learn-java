package qspeiderPrograms.ArmstrongPrograms;

import static qspeiderPrograms.ArmstrongPrograms.CheckArmStrong.isArmStrongNumber;

public class SmallestArmNumRange {
    public static void main(String[] args) {
        System.out.println(smallestArmStrongNumInRange(100, 500));
    }

    private static int smallestArmStrongNumInRange(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (isArmStrongNumber(i))
                return i;
        }

        return -1;
    }

    // Same helper methods
}

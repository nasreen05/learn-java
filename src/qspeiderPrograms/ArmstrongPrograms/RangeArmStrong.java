package qspeiderPrograms.ArmstrongPrograms;

import static qspeiderPrograms.ArmstrongPrograms.CheckArmStrong.isArmStrongNumber;

public class RangeArmStrong {
    public static void main(String[] args) {
        rangeOfArmStrong(100, 500);
    }

    private static void rangeOfArmStrong(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmStrongNumber(i))
                System.out.print(i + " ");
        }
    }

    // Same helper methods
}

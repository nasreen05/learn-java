package programmingClass.ArmstrongPrograms;

import static programmingClass.ArmstrongPrograms.CheckArmStrong.isArmStrongNumber;

public class LargestArmNumRange {
    public static void main(String[] args) {
        System.out.println(largetArmStrongNumInRange(100, 500));
    }

    private static int largetArmStrongNumInRange(int start, int end) {

        for (int i = end; i >= start; i--) {
            if (isArmStrongNumber(i))
                return i;
        }

        return -1;
    }

    // Same helper methods
}
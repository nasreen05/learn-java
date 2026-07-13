package programmingClass.ArmstrongPrograms;

import static programmingClass.ArmstrongPrograms.CheckArmStrong.isArmStrongNumber;
import static programmingClass.ArmstrongPrograms.NextArmstrongNum.nextArmStrong;
import static programmingClass.ArmstrongPrograms.PreviousArmstrongNum.previousArmStrong;

public class NearestArmStrong {
        public static void main(String[] args) {
            System.out.println(nearestArmStrong(200));
        }

        public static int nearestArmStrong(int n) {

            if (isArmStrongNumber(n))
                return n;

            int previous = previousArmStrong(n);
            int next = nextArmStrong(n);

            int previousDistance = n - previous;
            int nextDistance = next - n;

            return previousDistance <= nextDistance ? previous : next;
        }

        // Same helper methods
    }

package qspeiderPrograms.ArmstrongPrograms;
  /* ----> Check whether a number is Armstrong or not

--> Find next Armstrong number

--> Find previous Armstrong number

--> Find nth next Armstrong number

--> Find nth previous Armstrong number

--> Print Armstrong numbers in a range

--> Count Armstrong numbers in a range

--> Sum Armstrong numbers in a range

--> Find smallest Armstrong number in a range

--> Find largest Armstrong number in a range

--> Find nearest Armstrong number

   */
    public class AllArmStrongNumber {

    public static void main(String[] args) {
        // Check whether a number is Armstrong or not
          int n=153;
          if(isArmStrongNumber(n))
            System.out.println(n);

        System.out.println("Next ArmStrong Number"+nextArmStrong(700));

        System.out.println("Previous ArmStrong Number"+previousArmStrong(700));

        System.out.println("next 3rd ArmStrong Number"+nextNthArmStrong(153, 3));

        System.out.println("Previous nth armStrong number"+previousNthArmStrong(400, 4));
        rangeOfArmStrong(100,500);

        countOfArmStrongInRange(100, 500);

        sumOfArmStrongInRange(100, 500);

        System.out.println("Smallest ArmStrong Number in range"+smallestArmStrongNumInRange(100,500));

        System.out.println("Largest ArmStrong Number in range"+largetArmStrongNumInRange(100,500));
        System.out.println(" Nearest ArmStrong Number"+ nearestArmStrong(200));

    }

    public static  int nearestArmStrong(int n) {
        if (isArmStrongNumber( n))
            return n;
        int previous = previousArmStrong(n);
        int next = nextArmStrong(n);
        int previousDistance = n-previous;
        int nextDistance = next-n;
        return previousDistance <= nextDistance?previous:next;


    }

    private static int nextArmStrong(int n) {
        while(true) {
            n++;
            if(isArmStrongNumber(n))
                return n;
        }
    }

    private static int nextNthArmStrong(int n, int nth) {
        int count=0;
        while(true) {
            n++;
            if(isArmStrongNumber(n))
                count++;
            if(count==nth)
                return n;
        }
    }
    private static int previousArmStrong(int n) {
        while(true) {
            n--;
            if(isArmStrongNumber(n))
                return n;
        }
    }
    private static int previousNthArmStrong(int n, int nth) {
        int count=0;
        while(true) {
            n--;
            if(isArmStrongNumber(n))
                count++;
            if(count==nth)
                return n;
        }
    }

    private static int smallestArmStrongNumInRange(int start, int end) {
        for(int i=start;i<=end;i++) {
            if(isArmStrongNumber(i))
                return i;
        }
        return -1;
    }

    private static int largetArmStrongNumInRange(int start, int end) {
        for(int i=end;i>=start;i--) {
            if(isArmStrongNumber(i))
                return i;
        }
        return -1;
    }


    private static void rangeOfArmStrong(int start, int end) {
        System.out.println("The Range Of ArmStrong Number from "+start+" to "+end+" is :");
        for(int i=start;i<=end;i++) {
            if(isArmStrongNumber(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }


    private static void countOfArmStrongInRange(int start, int end) {
        int count=0;
        for(int i=start;i<=end;i++) {
            if(isArmStrongNumber(i))
                count++;
        }
        System.out.println("Count "+count);
    }



    private static void sumOfArmStrongInRange(int start, int end) {
        int sum=0;
        for(int i=start;i<=end;i++) {
            if(isArmStrongNumber(i))
                sum+=i;
        }
        System.out.println("Sum :"+sum);

    }

    private static boolean isArmStrongNumber(int n) {
        int count=digitsInNumber(n);
        int originalNum=n;
        int sum=0;
        while(n!=0) {
            int dig=n%10;
            sum=sum+raiseToPower(dig,count);
            n /=10;
        }
        return originalNum==sum;
    }


    private static int raiseToPower(int dig, int count) {
        int pow=1;
        for(int i=1;i<=count;i++) {
            pow=pow*dig;
        }
        return pow;
    }


    private static int digitsInNumber(int n) {
        int count=0;
        while(n!=0) {
            count++;n/=10;
        }
        return count;
    }
}

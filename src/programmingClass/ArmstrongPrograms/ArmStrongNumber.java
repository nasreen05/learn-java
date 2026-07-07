package programmingClass.ArmstrongPrograms;

public class ArmStrongNumber {

    public static void main(String[] args) {
        int n=153;
        if(isArmStrongNumber(n))
            System.out.println(n);

        System.out.println("Next ArmStrong Number :"+nextArmStrong(700));
        System.out.println("Previous ArmStrong Number :"+previousArmStrong(700));
        System.out.println("next 3rd ArmStrong Num :"+nextNthArmStrong(153, 3));
        System.out.println("Previous nth armStrong number :"+previousNthArmStrong(400, 4));
        rangeOfArmStrong(100,500);
        countOfArmStrongInRange(100, 500);
        sumOfArmStrongInRange(100, 500);
        System.out.println("Smallest ArmStrong Num in range :"+smallestArmStrongNumInRange(100,500));
        System.out.println("Largest ArmStrong Num in range :"+largetArmStrongNumInRange(100,500));

    }

    private static int nextArmStrong(int n) {
        while(true) {
            n++;
            if(isArmStrongNumber(n))
                return n;
        }}

    private static int nextNthArmStrong(int n, int nth) {
        int count=0;
        while(true) {
            n++;
            if(isArmStrongNumber(n))
                count++;

            if(count==nth)
                return n;

        }}
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

        }}

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
        int count=digitsInNum(n);
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

    private static int digitsInNum(int n) {
        int count=0;
        while(n!=0) {
            count++;n/=10;
        }
        return count;
    }
}
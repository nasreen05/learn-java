package basic.array.arrayEasy;

public class AverageSum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int sum=0;
        for(int i=1;i< args.length;i++) {
            sum += arr[i];
            double avg = sum / (double) arr.length;

            System.out.println(avg);
        }
    }
}

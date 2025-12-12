package basic.array.arrayEasy;

public class SumAverageNum {
    public static void main(String[] args) {
        int []arr={9,8,7,6,5};
        int sum=0;

        for(int x:arr)
            sum +=x;
        double avg= sum /(double) arr.length;


        System.out.println("sum"+sum);
        System.out.println("avg"+avg);
    }
}

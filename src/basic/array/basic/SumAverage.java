package basic.array.basic;

public class SumAverage {
    public static void main(String[] args) {
        int [] num={1,3,6,8,9};
        int sum=0;

       for(int x :num)
           sum+=x;
       double avg = sum /(double)num.length;

        System.out.println("Sum = " + sum);
        System.out.println("avg = " + avg);


    }

}

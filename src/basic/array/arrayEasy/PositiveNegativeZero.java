package basic.array.arrayEasy;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int [] num={-1,2,3,5,-8,-6,0};
        int positive=0, negative=0,zero=0;

        for(int i=0;i<num.length;i++) {
            if (num[i] > 0)
                positive++;

            else if (num[i] < 0)
                negative++;

            else
                zero++;
        }
        System.out.println("Positive :"+positive);
        System.out.println("Negative :"+negative);
        System.out.println("Zero :"+zero);

    }
}

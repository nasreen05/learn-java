package basic.array.arrayEasy;

public class SumElements {
    public static void main(String[] args) {
     int [] num={2,4,6,7,9};
     int sum=0;
     for(int i=0;i< num.length;i++){
         sum+=num[i];
     }
        System.out.println("sum ="+sum);
    }
}

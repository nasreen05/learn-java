package basic.array.arrayEasy;

public class EvenOdd {
    public static void main(String[] args) {
    int []arr={2,4,5,6,7,8,9};
    int even=0;
    int odd=0;
    for(int x: arr){
        if(x%2==0)
            even++;
        else odd++;

    }
        System.out.println("even= "+even);
        System.out.println("odd= "+odd);
    }
}


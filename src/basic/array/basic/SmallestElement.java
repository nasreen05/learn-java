package basic.array.basic;

public class SmallestElement {
    public static void main(String[] args) {
        int [] num={1,3,5,6,7,8};
        int smallest=num[0];

        for( int i=1;i< num.length;i++){
            if(num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("Smallest = "+ smallest);
    }
}

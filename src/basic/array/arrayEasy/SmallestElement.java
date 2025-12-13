package basic.array.arrayEasy;

public class SmallestElement {
    public static void main(String[] args) {
        int [] num={23,334,56,778,9,46};
        int smallest=num[0];

        for( int i=0;i< num.length;i++){
            if(num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("Smallest ="+smallest);
    }
}

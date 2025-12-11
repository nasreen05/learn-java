package basic.array.basic;

public class CountSameDigit {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7,5,9,5,8,5,5,5};
        int target=5;
        int count=0;

        for(int i=0;i< num.length;i++){
            if(num[i]==target){
                count++;
            }
        }
        System.out.println("count : " + count);
    }
}

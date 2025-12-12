package basic.array.arrayMedium;

public class PositionDuplicateValue {
    public static void main(String[] args) {
        int [] num={2,3,3,2,4};
        int value=2;
        System.out.println("position of the value 2 :");

        for(int i=1;i< num.length;i++){
            if(num[i]==value){
                System.out.println(i);
            }
        }
    }
}

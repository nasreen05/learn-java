package basic.array.arrayEasy;

public class LargestElement {
    public static void main(String[] args) {

       int [] num={98,87,76,65,54};
       int largest=num[0];

       for (int i=1;i< num.length;i++){
           if(num[i]>largest){
               num[i]=largest;
           }
        }
        System.out.println("largest = "+largest);
    }
}

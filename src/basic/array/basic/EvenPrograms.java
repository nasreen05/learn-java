package basic.array.basic;

public class EvenPrograms {
    public static void main(String[] args) {
         int [] num={1,2,3,4,5,6,7};
         int  even=0;


         for(int i=0;i< num.length;i++){
             if(num[i]%2==0){
                 System.out.println(num[i]);
             }
         }
    }
}

package basic.array.arrayEasy;

public class FindIndex {
    public static void main(String[] args) {
        int [] num={23,45,67,11,24,59};
        int target=11;
        int index=-1;

       for(int i=0;i<num.length;i++){
           if(num[i]==target){
               index=i;

           }
       }
        System.out.println("Index: "+index);
    }
}

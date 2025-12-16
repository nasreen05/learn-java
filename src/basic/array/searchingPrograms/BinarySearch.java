package basic.array.searchingPrograms;

public class BinarySearch {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         int search=5;
         int low=0;
         int high= num.length-1;

         while(low<=high){
             int mid=(low+high)/2;

             if(num[mid]==search){
                 System.out.println("Element found "+mid);
                 return;
             } else if (num[mid]<search) {
                 low=mid+1;
             }else{
                 high=mid-1;
             }
         }
        System.out.println("Element found ");

    }
}
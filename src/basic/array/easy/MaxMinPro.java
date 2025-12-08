package basic.array.easy;

public class MaxMinPro {
    public static void main(String[] args) {
      int []arr={12,34,56,78};
      int max=arr[0];
      int min=arr[0];

      for(int i=1;i< arr.length;i++){
          if(arr[i]> max)
              max=arr[i];
          if(arr[i]<min)
              min=arr[i];
      }
        System.out.println("Max"+max);
        System.out.println("Min"+min);

    }
}

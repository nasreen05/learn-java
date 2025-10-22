package basic.array;

public class Sorted2Prac {
    public static void main(String[] args){
        boolean isSorted=true;
        int []arr={23,455,2367,89,87};
        for(int i=0;i<arr.length;i++){
            if(arr [i] > arr[i+1]){
                isSorted=false;
                break;

            }
            }
            if(isSorted){
        System.out.println("tHe value is Sorted ");
      }
            else{
        System.out.println("The value is not sorted");
            }
        }
    }


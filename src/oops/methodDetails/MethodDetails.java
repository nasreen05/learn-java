package MethodDetails;

public class MethodDetails {

  static void change(int a) {
    a = 98;
  }

  static void change2(int[] arr) {
    arr[0] = 98;
  }

    public static void main(String[] args){
         int [] marks={34,456,67,89,93};//marks-- reference variable
       change2(marks);
    System.out.println(" the value of the   x after runnig change is :"+marks[0]);
    }
    }
// Note : in case of array the reference is  passed same is the case  for  object passing to methods.

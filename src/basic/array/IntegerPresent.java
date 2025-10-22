package basic.array;

// Write a program to find out whether a given integer is present  in an array or not-----------

public class IntegerPresent {
  public static void main(String[] args) {
    float[] marks = {23.5f, 56.f, 78.9f, 45.7f, 66.6f};
   float  num=23.5f;
   boolean isInArray=false;
   for(float element:marks){
       if(num==element){
           isInArray=true;
           break;
       }
       }
       if(isInArray){
           System.out.println("The Number is Integer");

      }else {
        System.out.println("The number is not a Integer");
      }
   }
  }


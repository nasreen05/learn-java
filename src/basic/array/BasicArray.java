package basic.array;

public class BasicArray {
    public static void main(String[]args){
        /* classroom of 500 student - you have to store marks of these 500 students
        you have 2 option:
        1. create 500 variables
        2. Use  Array (Recommended)
            Array is collection of similar type of data
         */

        //-------------there are 3 ways to create an array---------------------------


   //  1.     int [] marks= new int[5]; ----- Declaration + Memory Allocation

        //  2. int[]marks= {100,20,30,89,90}--> Declaration +  Initialize + memory allocation  together

// 3.
       int []marks; //---Declaration
        marks=new int[5];  //---Memory Allocation
        marks[0]=100;
        marks[1]=60;
        marks[2]=70;
        marks[3]=90;
        marks[4]=96;
        marks[4]=96;
       // marks[5]=90;- throws an error

    System.out.println(marks[4]);
  }
}


// Arrat indices starts from 0 and goes tuill (n-1) where n is size of the array

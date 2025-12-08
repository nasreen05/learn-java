package basic.array.basic;


// Calculate the array marks from an array containing marks of all students in physics using for each loop

public class Exercise3 {
  public static void main(String[] args) {
      int [] number={34,56,78,89,90};
      int sum=0;
      for(int element : number){
          sum=sum + element;
          }
      System.out.println("The average of the sum is " + sum / number.length);
      }
  }


package basic.array.basic;

public class Exercise1 {
  public static void main(String[] args) {

// Create an array of 5 floats and calculate  their  sum---------------------


    /* first Process
        float num1=20.5f;

        float num2=30.9f;
        float num3=34.5f;
        float num4= 45.6f;
        float num5=98.7f;
        float total = (num1+num2+num3+num4+num5);
    System.out.println(total); */

    // 2nd way---------------

    float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
    float sum = 0;
    for (float element : marks) {
      sum = sum + element;
      System.out.println(sum);
    }
  }
    }
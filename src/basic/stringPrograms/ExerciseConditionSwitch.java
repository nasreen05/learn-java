package basic.stringPrograms;
import java.util.Scanner;

public class ExerciseConditionSwitch {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    byte m1, m2, m3;
    System.out.println("Enter the marks Of Math : ");
    m1 = sc.nextByte();
    System.out.println("Enter the marks of Physics :");
    m2 = sc.nextByte();
    System.out.println("Enter the marks of Chemistry :");
    m3 = sc.nextByte();
    float avg = (m1 + m2 + m3) / 3.0f;
    System.out.println("Overall Percentage is : "+avg);

    if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
      System.out.println(" Pass");
    } else {
      System.out.println("Fail");
    }
  }
    }
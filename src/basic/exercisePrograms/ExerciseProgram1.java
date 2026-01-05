package basic.exercisePrograms;

public class ExerciseProgram1 {
  public static void main(String[] args) {
   int  a=10;
   int b=a++;
   int c= ++a;
   a=a++ + ++b + c++;
   b=b++ + ++c + a++;
   c=c++ +  ++a +  b++;
   System.out.println(a);
   System.out.println(b);
    System.out.println(c);
    }
  }

package TechnicalPrograms;

public class AddNum {
  public static void main(String[] args) {
  int a=9;
  int b=7;
  int c;
  while (b!=0){
      c=a&b;
      a=a^b;
      b=c<<1;
  }
    System.out.println(a);
      }

      }

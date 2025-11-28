package oops.technicalPrograms;

public class AllFactorsCount1 {
  public static void main(String[] args) {
      int num=28;
      int count=0;

      for(int i=1;i<=num;i++){
          if(num%i==0){
        System.out.print(i+" ");
          count++;
          }
      }
    System.out.println("count "+ count);
  }
       }
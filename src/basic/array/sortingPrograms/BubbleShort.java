package basic.array.sortingPrograms;

public class BubbleShort {
    public static void main(String[] args) {
          int [] num={5,6,1,8,2,9,3,4};

          for(int i=0;i< num.length-1;i++){
              for(int j=0;j< num.length-i-1;j++){
                  if(num[j]>num[j+1]){
                      int temp=num[j];
                     num[j]=num[j+1];
                     num[j+1]=temp;
                  }
              }
          }
        System.out.println("sorted in array ");
        for(int x:num){
            System.out.println(x);

        }


            }
        }



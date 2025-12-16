package basic.array.sortingPrograms;

public class InsertionSort {
    public static void main(String[] args) {
int [] num={5,6,2,3,9,1,8};
for(int i=1;i< num.length;i++){
    int temp=num[i];
    int j=i-1;

    while(j>=0 && num[j]>temp){
        num[j+1]=num[j];
        j--;

    }
    num[j+1]=temp;
}
        System.out.println("After sorting");
 for(int n:num){
     System.out.println(n);
 }






















    }
}


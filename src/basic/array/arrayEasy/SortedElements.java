package basic.array.arrayEasy;

public class SortedElements {
    public static void main(String[] args) {
        int[]  num={23,45,41,12,31,42};
        boolean shorted=true;

        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                shorted=false;
                break;
            }
        }
        if(shorted)
            System.out.println("array  Shoeted element");

    else
            System.out.println("array not a sorted");
    }
}

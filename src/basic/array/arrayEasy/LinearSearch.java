package basic.array.arrayEasy;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7};
        int search=5;
        boolean found=false;

        for(int i=0;i< arr.length;i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index:");
                found = true;
                break;
            }
        }
            if(!found)
                System.out.println("Element not found");
    }
}

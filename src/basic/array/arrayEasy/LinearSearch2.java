package basic.array.arrayEasy;

public class LinearSearch2 {
    public static void main(String[] args) {
        int [] arr={23,34,56,78,98};
        int taget=34;
        boolean found=false;

        for(int i=0;i< arr.length;i++) {
            if (arr[i] < taget) {
                found = true;
                break;
            }
        }
            if(found)
                System.out.println("Found the  number");
            else
                System.out.println("Not a Found :");
            }
        }



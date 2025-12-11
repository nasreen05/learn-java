package basic.array.basic;

public class LargestElement {
    public static void main(String[] args) {
        int [] num={5,8,9,7};
        int largest=num[0];

        for(int i=1;i<num.length;i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

                System.out.println("Largest = "+ largest);

            }
        }

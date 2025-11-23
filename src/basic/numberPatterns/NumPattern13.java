package basic.numberPatterns;

public class NumPattern13 {
    public static void main(String[] args){
        int row = 5;
        int star = 1;

        for (int r = 1; r <= row; r++) {

            for (int i = 1; i <= star; i++) {
                System.out.print(i);
            }


            for (int i = star - 1; i >= 1; i--) {
                System.out.print(i);
            }

            System.out.println();
            star++;
        }
    }
}


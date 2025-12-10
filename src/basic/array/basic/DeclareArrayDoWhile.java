package basic.array.basic;

public class DeclareArrayDoWhile {
    public static void main(String[] args) {
            int [] array = {10,20,30,40,50,60};
            System.out.println(array[0]);
            System.out.println(array.length);
            System.out.println(array[1]);
            System.out.println(array.length);
            System.out.println(array[2]);
            System.out.println(array.length);

        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while(i <= array.length - 1);
    }
}

/*-----------Home-Work----------------
1)      Create class for each array of different datatype       Print  the value of each array using index in array [0] array[1] the print array using for , while, do while loop
 */
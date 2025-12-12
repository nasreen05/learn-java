package basic.array.arrayEasy;

public class DeclareArrayWhile {
    public static void main(String[] args) {
        int [] array={10,20,30,40,50,60};
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array.length);
        System.out.println(array[1]);
        System.out.println(array.length);
        System.out.println(array[2]);
        System.out.println(array.length);

        int i=0;

        while(i<= array.length-1) {
            System.out.println(array[i]);
            i++;
        }
    }
}


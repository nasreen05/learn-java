package oops.exceptionPrograms;

public class RunTimeException {
    public static void main(String[] args) {
        int array[] = new int[4];
        // 0,1,2,3
//        System.out.println(array[1]);
//        4<4
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        try {
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Array size is " + array.length);

    }
}


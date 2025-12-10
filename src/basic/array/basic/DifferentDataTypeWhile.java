package basic.array.basic;

public class DifferentDataTypeWhile {
    public static void main(String[] args) {


        float[] floatArr = {10.5f, 20.7f, 30.2f};
        double[] doubleArr = {45.67, 78.90, 12.34};
        long[] longArr = {1000000000L, 2000000000L, 3000000000L};
        boolean[] boolArr = {true, false, true};
        short[] shortArr = {5, 10, 15};


        System.out.println("Print using Index:");
        System.out.println(floatArr[0] + " , " + floatArr[1]);
        System.out.println(doubleArr[0] + " , " + doubleArr[1]);
        System.out.println(longArr[0] + " , " + longArr[1]);
        System.out.println(boolArr[0] + " , " + boolArr[1]);
        System.out.println(shortArr[0] + " , " + shortArr[1]);
        System.out.println("--------------------------------");


                System.out.println("Using While Loop - Float Array:");
                int i = 0;
                while (i < floatArr.length) {
                    System.out.println(floatArr[i]);
                    i++;
                }
                System.out.println("--------------------------------");


                System.out.println("Using While Loop - Double Array:");
                int j = 0; // changed variable name
                while (j < doubleArr.length) {
                    System.out.println(doubleArr[j]);
                    j++;
                }
                System.out.println("--------------------------------");


                System.out.println("Using While Loop - Long Array:");
                int k = 0;
                 while (k < longArr.length) {
            System.out.println(longArr[k]);
            k++;
        }
        System.out.println("--------------------------------");



        System.out.println("Using While Loop - Boolean Array:");
        int m = 0;
        while (m < boolArr.length) {
            System.out.println(boolArr[m]);
            m++;
        }
        System.out.println("--------------------------------");


        System.out.println("Using While Loop - Short Array:");
        int n = 0;
        while (n < shortArr.length) {
            System.out.println(shortArr[n]);
            n++;
        }
        System.out.println("--------------------------------");
    }
}


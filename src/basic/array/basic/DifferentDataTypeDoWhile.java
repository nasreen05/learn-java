package basic.array.basic;

public class DifferentDataTypeDoWhile {

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


            System.out.println("Using Do-While Loop - Float Array:");
            int i = 0;
            do {
                System.out.println(floatArr[i]);
                i++;
            } while (i < floatArr.length);
            System.out.println("--------------------------------");


            System.out.println("Using Do-While Loop - Double Array:");
            int j = 0;
            do {
                System.out.println(doubleArr[j]);
                j++;
            } while (j < doubleArr.length);
            System.out.println("--------------------------------");


            System.out.println("Using Do-While Loop - Long Array:");
            int k = 0;
            do {
                System.out.println(longArr[k]);
                k++;
            } while (k < longArr.length);
            System.out.println("--------------------------------");


            System.out.println("Using Do-While Loop - Boolean Array:");
            int m = 0;
            do {
                System.out.println(boolArr[m]);
                m++;
            } while (m < boolArr.length);
            System.out.println("--------------------------------");


            System.out.println("Using Do-While Loop - Short Array:");
            int n = 0;
            do {
                System.out.println(shortArr[n]);
                n++;
            } while (n < shortArr.length);
            System.out.println("--------------------------------");
        }
    }


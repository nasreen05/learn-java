package basic.array.basic;

public class DifferentDataType {
    public static void main(String[] args) {
        int [] num={12,30,40,50,60};
        float[] floatArr = {10.5f, 20.7f, 30.2f};
        double[] doubleArr = {45.67, 78.90, 12.34};
        long[] longArr = {1000000000L, 2000000000L, 3000000000L};
        boolean[] boolArr = {true, false, true};
        short[] shortArr = {5, 10, 15};

        System.out.println(num[0]+"," +num[1]);
        System.out.println(floatArr[1]+","+floatArr[2]);
        System.out.println(doubleArr[0] + " , " + doubleArr[1]);
        System.out.println(longArr[0] + " , " + longArr[1]);
        System.out.println(boolArr[0] + " , " + boolArr[1]);
        System.out.println(shortArr[0] + " , " + shortArr[1]);
        System.out.println("--------------------------------");


        System.out.println("using for loop");
        System.out.println("Float Array----------------------------------------");
         for(int i=0;i< floatArr.length;i++){
             System.out.println(floatArr[i]);
         }

        System.out.println("Double Array---------------------------------------");
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.println(doubleArr[i]);
        }

        System.out.println("Long Array---------------------------------------");
        for (int i = 0; i < longArr.length; i++) {
            System.out.println(longArr[i]);
        }

        System.out.println("Boolean Array-------------------------------------");
        for (int i = 0; i < boolArr.length; i++) {
            System.out.println(boolArr[i]);
        }

        System.out.println("Short Array-----------------------------------------");
        for (int i = 0; i < shortArr.length; i++) {
            System.out.println(shortArr[i]);
        }

        System.out.println("--------------------------------");


    }
}

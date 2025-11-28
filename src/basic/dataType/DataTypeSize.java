package basic.dataType;

public class DataTypeSize {

        public static void main(String[] args) {

            //2^(n-1) to 2^(n-1)-1
            byte a = 127; // -128 to 127

            short s = 32767; //  -32768 to 32767

            int speed = 2147483647; // -2147483648 to 2147483647

            long salary = 21474836481L;

            float f = 34.4f;

            double d = 23.5d;
            System.out.println(a);
            System.out.println(s);
            System.out.println(speed);

            // int = 4 bytes // 32bit // byte = 8bit // long = 8bytes
            // float = 4 bytes // double = 8 bytes // boolean = 1bit // char = 2byte
            // byte = 1byte = 8bit // Short = 2byte = 16 bit // byte = 2  2

            //0000 0001 = 1
            //0000 0010 = 2
            //0000 0011 = 3
            //0000 0100 = 4
            //0000 0101 = 5
            //0000 0110 = 6
            //0000 0111 = 7
            //0000 1000 = 8
            //0000 1001 = 9
            //0001 0000 = 10
            //0111 1111 = 127
            //1byte = 8bits
            //128643216 8421
            //9000 0000

            //1bit =

            //5 + 5;

            //0101
            //0101
            //1010

            // highlevel - compilation - bytecode run machine level code
        }
    }

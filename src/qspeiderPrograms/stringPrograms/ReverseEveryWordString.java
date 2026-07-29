package qspeiderPrograms.stringPrograms;

import java.util.Arrays;

public class ReverseEveryWordString {
    public static void main(String[] args) {

        String str = "I Love Java";
        System.out.println(str);

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i].trim();

            StringBuffer sb = new StringBuffer(arr[i]);
            sb.reverse();

            arr[i] = sb.toString();

            str.concat(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}

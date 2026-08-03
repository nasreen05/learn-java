package qspeiderPrograms.numberPrograms;

public class CountingNumDigits {
    public static void main(String[] args) {
        int num = 12345;
                int count = 0;

                while (num != 0) {
                    num = num / 10;
                    count++;
                }

                System.out.println("Number of digits: " + count);
            }
        }
    /*
    public class CountDigits {

    public static void main(String[] args) {
        int num = 0;
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
--------------------Using String ----------
public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;

        int count = String.valueOf(num).length();

        System.out.println("Number of digits: " + count);
    }
}
     */
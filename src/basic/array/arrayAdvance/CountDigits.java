package basic.array.arrayAdvance;

class CountDigits {
    public static void main(String[] args) {
        int num = 5678;   
        int count = 0;
        int temp = num;

        while (temp > 0) {
            count++;
            temp = temp / 10;  
        }

        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + count);
    }
}

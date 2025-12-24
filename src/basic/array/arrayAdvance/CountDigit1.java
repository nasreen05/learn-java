package basic.array.arrayAdvance;

class CountDigit1{
    public static void main(String[] args) {
        int num = 123;   
        int count = 0;
        int temp = num;

        while (temp > 0) {
            count++;
            temp = temp / 10;  
        }

        System.out.println("Number: " + num);
        System.out.println("Number of digits: " + count);
    }
}

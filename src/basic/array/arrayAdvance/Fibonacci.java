package basic.array.arrayAdvance;

class   Fibonacci{

    public static void main(String[] args) {
        int nums = 20;

        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series up to " + nums + " terms: ");

        for (int i = 1; i <= nums; i++) {   
            System.out.print(a + " ");      
            int c = a + b;
            a = b;                          
            b = c;
        }
    }
}

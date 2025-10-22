package oops.arrayAdvance;

class NumberCheck {
    private int num;

   
    public NumberCheck(int num) {
        this.num = num;
    }

    
    public void checkEvenOdd() {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}


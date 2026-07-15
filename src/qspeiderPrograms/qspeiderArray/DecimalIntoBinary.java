package qspeiderPrograms.qspeiderArray;

public class DecimalIntoBinary {
    public static void main(String[] args) {
        int num=12;
        StringBuffer sb= new StringBuffer();
        while(num !=0){
            int rem=num%2;
            sb.insert(0, rem);
            num= num/2;
        }
        System.out.println(" Number : " +sb );
    }
}

package qspeiderPrograms.ArrayPrograms;

public class DecimalIntoHexadecimal {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int num=362;
        while(num !=0){
            int rem=num%16;
            sb.insert(0,ch[rem]);
            num= num/16;
        }
        System.out.println(" Number : " +sb );
    }
}


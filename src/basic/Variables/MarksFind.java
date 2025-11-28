package basic.Variables;

public class MarksFind {
        public static void main(String[] args){
            int s1 = 78;
            int s2 = 85;
            int s3 = 90;
            int s4 = 66;
            int s5 = 72;
            int s6 = 88;
            int s7 = 91;
            int s8 = 69;
            int s9 = 95;
            int s10 = 80;

            int total = totalMarks(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
            int avg = average(total);

            System.out.println("Total Marks = " + total);
            System.out.println("Average = " + avg);
        }

        public static int totalMarks(int s1,int s2,int s3,int s4,int s5,int s6,int s7,int s8,int s9,int s10) {
            return s1+s2+s3+s4+s5+s6+s7+s8+s9+s10;
        }

        public static int average(int total) {
            return total / 10;
        }
    }



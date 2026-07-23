package qspeiderPrograms.stringPrograms;

public class ConsonentCount {
       public static void main(String[] args) {
            String c = "qwrtyplkjhgfdszxcvbnm";
            int count = 0;
            String s = " abcd12f75ghddiouutoplk934?$#";

            for (int i = 0; i < s.length(); i++) {
                if (c.contains(s.charAt(i) + "")) {
                    System.out.println(s.charAt(i));
                    count++;
                }
            }

            System.out.println("Consonent :" + count);
        }
    }
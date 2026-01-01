package recursion.intermediate;

public class FindString1 {
    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String st, int idx, char element) {
        if (idx == st.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = st.charAt(idx);
        if (curr == element) {
            if (first == -1) {
                first = idx;

            } else {
                last = idx;

            }
        }

            findOcc(st, idx + 1, element);
        }

        public static void main (String[]args){
            String st = "abaacdaefaah";
            findOcc(st, 0, 'a');
        }
    }


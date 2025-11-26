package basic.controlStatement.decisionMakingStatement;

public class Password {
    public static void main(String[] args){

                String password = "Abc12@";
                int length = password.length();

                int letters = 0;
                int digits = 0;
                int special = 0;
                int upper = 0;
                int lower = 0;

                char c1 = password.charAt(0);
                if((c1>='a' && c1<='z') || (c1>='A' && c1<='Z')){
                    letters++;
                    if(c1>='A' && c1<='Z') upper++;
                    else lower++;
                }
                else if(c1>='0' && c1<='9'){ digits++; }
                else{ special++; }


                char c2 = password.charAt(1);
                if((c2>='a' && c2<='z') || (c2>='A' && c2<='Z')){
                    letters++;
                    if(c2>='A' && c2<='Z') upper++;
                    else lower++;
                }
                else if(c2>='0' && c2<='9'){ digits++; }
                else{ special++; }


                char c3 = password.charAt(2);
                if((c3>='a' && c3<='z') || (c3>='A' && c3<='Z')){
                    letters++;
                    if(c3>='A' && c3<='Z') upper++;
                    else lower++;
                }
                else if(c3>='0' && c3<='9'){ digits++; }
                else{ special++; }


                char c4 = password.charAt(3);
                if((c4>='a' && c4<='z') || (c4>='A' && c4<='Z')){
                    letters++;
                    if(c4>='A' && c4<='Z') upper++;
                    else lower++;
                }
                else if(c4>='0' && c4<='9'){ digits++; }
                else{ special++; }


                char c5 = password.charAt(4);
                if((c5>='a' && c5<='z') || (c5>='A' && c5<='Z')){
                    letters++;
                    if(c5>='A' && c5<='Z') upper++;
                    else lower++;
                }
                else if(c5>='0' && c5<='9'){ digits++; }
                else{ special++; }


                char c6 = password.charAt(5);
                if((c6>='a' && c6<='z') || (c6>='A' && c6<='Z')){
                    letters++;
                    if(c6>='A' && c6<='Z') upper++;
                    else lower++;
                }
                else if(c6>='0' && c6<='9'){ digits++; }
                else{ special++; }


                if(length < 6){
                    System.out.println("Very Weak");
                }
                else if(letters > 0 && digits == 0 && special == 0){
                    System.out.println("Weak");
                }
                else if(letters > 0 && digits > 0 && special == 0){
                    System.out.println("Medium");
                }
                else if(letters > 0 && digits > 0 && special > 0){


                    if(upper > 0 && lower > 0){
                        System.out.println("Very Strong");
                    } else {
                        System.out.println("Strong");
                    }
                }
                else{
                    System.out.println("Invalid Password");
                }
            }
            }

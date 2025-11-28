package basic.Variables;

import static basic.Variables.Addition.addition;
import static basic.Variables.Substraction.substract;

public class AdditionWithParameter {
    public static void main(String[] args){

                // int num1 = 50;
                // int num2 = 20;

                int num1 = 50, num2 = 50;
                // num1 = 30;
                // num2 = 20;

                int result = addition(num1, num2);
                System.out.println(result);

                float resultSubstract = substract(20.12f, 100);
                System.out.println(resultSubstract);

                float resultSubstractChar = substractForChar(200.244f, 'a');
                System.out.println(resultSubstractChar);
            }

            public static int addition(int num1, int num2) {
                int result = num1 + num2;
                return result;
            }

            public static float substract(float num1, float num2) {
                float result = num1 - num2;
                return result;
            }

            public static float substractForChar(float num1, char num2) {
                float result = num1 - num2;
                return result;
            }
        }


// write a java program to print multiplication table of a number
// where method accept a number and print the multiplication table of number
// 3*1=3
// 3*2=6

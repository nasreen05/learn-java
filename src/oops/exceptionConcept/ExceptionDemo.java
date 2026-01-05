package oops.exceptionConcept;

public class ExceptionDemo {
    public static void main(String[] args) {
            int a = 100;
            int b= 0;
            int result = 0;
            String str = null;
            try {
                result = a / b;
                System.out.println(str.length());
            } catch (ArithmeticException | NullPointerException  e) {
                System.out.println(e);
            } finally {
                //
            }
//        catch (NullPointerException e) {
//            System.out.println(e);
//        }
            System.out.println(result);


// Exception
// checked Exception - CompileTimeException
// Exception which are known/found during compilation
// identified by compiler
// Unchecked Exception - RunTimeException
// Exception which are know/found during runtime
// identified by jvm


        }
    }



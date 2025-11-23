package oops.exceptionPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

    public class CompileTimeException {

        public static void main(String[] args) {
            try {
                FileReader fileReader = new FileReader("C://data.txt");
                System.out.println(fileReader.toString());
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

            // CompileTypeException - FileNotFoundException , SQLException
            // RunTimeException -ArithmeticException , NullPointerException
            // ArrayIndexOutOfBoundsException

            // ExceptionPropagation - exception sent to the caller
            // UserDefinedException / CustomException
            // throw, throws


        }
    }


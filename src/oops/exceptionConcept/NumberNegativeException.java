package oops.exceptionConcept;

public class NumberNegativeException extends Exception{
        public NumberNegativeException() {}

        public NumberNegativeException(String message) {
            super(message);
        }
    }

// Compile exception - fileNotFoundException
//runtime exception - Arithmetic Exception , ArrayIndexOutOfBoundException
// Not PointerException
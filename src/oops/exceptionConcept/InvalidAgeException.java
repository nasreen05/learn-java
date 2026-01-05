package oops.exceptionConcept;

public class InvalidAgeException  extends RuntimeException {

        public InvalidAgeException() {}
        public InvalidAgeException(String message) {
            super(message);
            //super.
        }
    }

// class extends Exception - Compile time exception
// class extends RuntimeExcetion - Run timeexception



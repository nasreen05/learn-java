package oops.methodConcept.overloading;

import basic.array.arrayAdvance.NumberCheck;
import basic.controlStatement.decisionMakingStatement.CheckNumber;

class NumberCheckRunner {
    public static void main(String[] args) {
        NumberCheck n1 = new NumberCheck(10);
        n1.checkEvenOdd();

        NumberCheck n2 = new NumberCheck(15);
        n2.checkEvenOdd();
    }
}
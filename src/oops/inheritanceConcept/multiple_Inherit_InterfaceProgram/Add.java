package oops.inheritanceConcept.multiple_Inherit_InterfaceProgram;

import oops.interfaceConcept.Calculator;

class Add extends Calculator {
        @Override
        public void operation(int a, int b) {
            System.out.println("Addition: " + (a + b));
        }
    }
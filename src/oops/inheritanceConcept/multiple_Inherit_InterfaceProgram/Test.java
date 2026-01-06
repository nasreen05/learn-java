package oops.inheritanceConcept.multiple_Inherit_InterfaceProgram;

    public class Test {
        public static void main(String[] args) {
            Add add = new Add();
            add.operation(10, 5);

            // Inherited from interface
            add.showInfo();
        }
    }


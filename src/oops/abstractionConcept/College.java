package oops.abstractionConcept;

    // Child class
    public class College extends University1 {

        public String name;

        public College() {}

        public College(String name, String universityName) {
            super(universityName);
            this.name = name;
        }

        @Override
        public void examination() {
            System.out.println("Conducting final examination");
        }

        public void internalTest() {
            System.out.println("Internal test / assessment conducted by college");
        }
    }


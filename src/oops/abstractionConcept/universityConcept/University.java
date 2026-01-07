package oops.abstractionConcept.universityConcept;
public abstract class University {

    public String universityName;

    public University() {
    }

    public University(String universityName) {
        this.universityName = universityName; // FIXED
    }

    public abstract void examination();

    // Inner Child class
    public static class College extends University {

        public College() {}

        public College(String universityName) {
            super(universityName);
        }

        @Override
        public void examination() {
            System.out.println("Conducting final examination");
        }

        public void InternalTest() {
            System.out.println("Internal test / assessment conducted by college");
        }
    }
}

package oops.abstractionConcept.universityConcept;
public class UniversityRunner {
    public static void main(String[] args) {

        // Using inner class
        University.College college = new University.College();
        college.examination();
        college.InternalTest();

        // Upcasting (Loose Coupling)
        University university = new University.College();
        university.examination();

        // Downcasting
        if (university instanceof University.College) {
            University.College college1 = (University.College) university;
            college1.InternalTest();
            college1.examination();
        }
    }
}

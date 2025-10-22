package oops.arrayAdvance;

class GovernmentExamRunner {
    public static void main(String[] args) {
        GovernmentExam exam1 = new GovernmentExam("Civils", 101L, "Bengaluru", 5, true);
        System.out.println(exam1.getName());
        System.out.println(exam1.getId());
        System.out.println(exam1.city());
        System.out.println(exam1.getNumberOfCenters());
        System.out.println(exam1.getResultsDelayed());

        System.out.println();

        GovernmentExam exam2 = new GovernmentExam("Railways", 102L, "Delhi", 8, false);
        System.out.println(exam2.getName());
        System.out.println(exam2.getId());
        System.out.println(exam2.city());
        System.out.println(exam2.getNumberOfCenters());
        System.out.println(exam2.getResultsDelayed());

        System.out.println();

        GovernmentExam exam3 = new GovernmentExam("Banking", 103L, "Mumbai", 6, true);
        System.out.println(exam3.getName());
        System.out.println(exam3.getId());
        System.out.println(exam3.city());
        System.out.println(exam3.getNumberOfCenters());
        System.out.println(exam3.getResultsDelayed());

        System.out.println();

        GovernmentExam exam4 = new GovernmentExam("Defence", 104L, "Chennai", 10, false);
        System.out.println(exam4.getName());
        System.out.println(exam4.getId());
        System.out.println(exam4.city());
        System.out.println(exam4.getNumberOfCenters());
        System.out.println(exam4.getResultsDelayed());

        System.out.println();

        GovernmentExam exam5 = new GovernmentExam("Teaching", 105L, "Kolkata", 7, true);
        System.out.println(exam5.getName());
        System.out.println(exam5.getId());
        System.out.println(exam5.city());
        System.out.println(exam5.getNumberOfCenters());
        System.out.println(exam5.getResultsDelayed());
    }
}

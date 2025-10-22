package oops.arrayAdvance;

class TrainRunner {
    public static void main(String[] args) {
        Train t1 = new Train("Rajdhani", 101L, "New Delhi", 5, false);
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t1.city());
        System.out.println(t1.getNumberOfEngineers());
        System.out.println(t1.getIsDelayed());

        System.out.println();

        Train t2 = new Train("Shatabdi", 102L, "Mumbai", 6, false);
        System.out.println(t2.getName());
        System.out.println(t2.getId());
        System.out.println(t2.city());
        System.out.println(t2.getNumberOfEngineers());
        System.out.println(t2.getIsDelayed());

        System.out.println();

        Train t3 = new Train("Duronto", 103L, "Kolkata", 8, true);
        System.out.println(t3.getName());
        System.out.println(t3.getId());
        System.out.println(t3.city());
        System.out.println(t3.getNumberOfEngineers());
        System.out.println(t3.getIsDelayed());

        System.out.println();

        Train t4 = new Train("KanchanKanna", 104L, "Chennai", 7, false);
        System.out.println(t4.getName());
        System.out.println(t4.getId());
        System.out.println(t4.city());
        System.out.println(t4.getNumberOfEngineers());
        System.out.println(t4.getIsDelayed());

        System.out.println();

        Train t5 = new Train("Tistatorsa", 105L, "Bengaluru", 10, true);
        System.out.println(t5.getName());
        System.out.println(t5.getId());
        System.out.println(t5.city());
        System.out.println(t5.getNumberOfEngineers());
        System.out.println(t5.getIsDelayed());
    }
}

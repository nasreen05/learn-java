package oops.arrayAdvance;
class CeoRunner {
    public static void main(String[] args) {

        Ceo ceo = new Ceo("Reshma", 1234, "Bangalore");
        System.out.println("CEO 1 Details:");
        System.out.println(ceo.getName());
        System.out.println(ceo.getSalary());
        System.out.println(ceo.getCity());

        Ceo ceo1 = new Ceo("Rafia", 34567, "Kolkata");
        System.out.println("\nCEO 2 Details:");
        System.out.println(ceo1.getName());
        System.out.println(ceo1.getSalary());
        System.out.println(ceo1.getCity());
    }
}

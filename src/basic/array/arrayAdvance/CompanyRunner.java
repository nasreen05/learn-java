package basic.array.arrayAdvance;

class CompanyRunner {
    public static void main(String[] args) {

        Company company = new Company("Infosys", 1234, "Bangalore");
        System.out.println("Company 1 details:");
        System.out.println(company.getName());
        System.out.println(company.getId());
        System.out.println(company.getCity());

        Company company1 = new Company("Wipro", 34567, "Kolkata", 1000);
        System.out.println("\nCompany 2 details:");
        System.out.println(company1.getName());
        System.out.println(company1.getCity());
        System.out.println(company1.getId());
        System.out.println(company1.getNumberOfEmployee());
    }
}

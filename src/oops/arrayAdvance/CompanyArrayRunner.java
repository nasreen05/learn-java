package oops.arrayAdvance;


class CompanyArrayRunner {
    public static void main(String[] args) {

        Company[] companies = new Company[5];

        Company company = new Company();
        company.setName("TCS");
        company.setCompanyAddress("Delhi");
        companies[0] = company;

        Company company1 = new Company();
        company1.setName("Wipro");
        company1.setCompanyAddress("Kolkata");
        companies[1] = company1;

        Company company2 = new Company();
        company2.setName("Infosys");
        company2.setCompanyAddress("Mumbai");
        companies[2] = company2;

        Company company3 = new Company();
        company3.setName("Publicis Sapient");
        company3.setCompanyAddress("Bangalore");
        companies[3] = company3;

        Company company4 = new Company();
        company4.setName("Thoughtworks");
        company4.setCompanyAddress("Chennai");
        companies[4] = company4;

        for (int i = 0; i < companies.length; i++) {
            System.out.println("Company " + (i + 1));
            Company localCompany = companies[i];
            System.out.println(localCompany.getName());
            System.out.println(localCompany.getCompanyAddress());
            System.out.println();
        }
    }
}

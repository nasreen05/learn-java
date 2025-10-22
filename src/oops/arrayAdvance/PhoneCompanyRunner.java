package oops.arrayAdvance;

class PhoneCompanyRunner{
	
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung galaxy s24 ultra", "Black", 500000.00f, 123);

        // String CompanyName, float weight, float displaySize
        Company company = new Company("Samsung", 2.5f, 6.5f);  

        phone.setCompany(company);

        System.out.println("Phone details===============");
        System.out.println(phone.getName());
        System.out.println(phone.getColor());
        System.out.println(phone.getPrice());
        System.out.println(phone.getPhoneId());

        Company company1 = company;
		System.out.println("Company details======");
        System.out.println(company.getCompanyName());
        System.out.println(company.getWeight());
        System.out.println(company.getDisplaySize());
    }
}

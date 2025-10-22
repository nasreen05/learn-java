package oops.arrayAdvance;

class CompanyCeoRunner{
	public static void main(String[] args) {
		Company company =new Company("Infosys",1234,"Bangalore",2000);
		System.out.println("priting comapany details");
		System.out.println(company.getName());
		System.out.println(company.getCity());

		Ceo ceo=new Ceo("Sging ",1234,"Bangalore");
		company.setceo(ceo);

        Ceo ceo1=company.getCeo();
        System.out.println("priting comapany details");
		System.out.println(company.getName());
		System.out.println(company.getCity());
	}
}
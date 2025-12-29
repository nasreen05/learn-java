package oops.methodConcept.overloading;

class CompanyCeoRunner{
	public static void main(String[] args) {
		Company company =new Company("Infosys",1234,"Bangalore",2000);
		System.out.println("priting comapany details");
		System.out.println(company.getName());
		System.out.println(company.getCity());

		CeoRunner.Ceo ceo=new CeoRunner.Ceo("Sging ",1234,"Bangalore");
		company.setceo(ceo);

        CeoRunner.Ceo ceo1=company.getCeo();
        System.out.println("priting comapany details");
		System.out.println(company.getName());
		System.out.println(company.getCity());
	}
}
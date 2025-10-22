package oops.methodDetails.overloading;

class CompanyRunner{
	public static void main(String[] args) {

     Company company =new Company("infosys", 1234,"Bangalore");
     System.out.println(company.getName());
     System.out.println(company.getId());
     System.out.println(company.getCity());



	Company company1=new Company("wipro",34567,"Kolkata",1000);

     System.out.println(company.getName());
     System.out.println(company.getCity());
     System.out.println(company.getId());
     System.out.println(company.getNumberOfEmployee());

 }
}

package oops.arrayAdvance;

class CompanyArrayRunner{
	public static void main(String[] args) {
		Company[] companys= new Company[5];

		Company company= new Company();
		company.setName("TCS");
		company.setCompanyAddress("Delhi");
	//	System.out.println(company.getCompanyAddress());
		companys[0]=company;
		
		Company company1= new Company();
		company1.setName("Wipro");
		company1.setCompanyAddress("kolkata");
		companys[1]=company;
		
		Company company2= new Company();
		company2.setName("infosys");
		company2.setCompanyAddress("mumbai");
		companys[2]=company;
		
		Company company3= new Company();
		company3.setName("Publicis sapient");
		company3.setCompanyAddress("Bengalore");
		companys[3]=company;
		
		Company company4= new Company();
		company4.setName("Thoughtworks");
		company4.setCompanyAddress("Channai");
		companys[4]=company;
        
		for(int i=0;i<companys.length;i++){
			System.out.println("Company"+(i+1));
			Company localCompany= companys[i];
			System.out.println(localCompany.getName());
			System.out.println(localCompany.getCompanyAddress());
			System.out.println();
		}
	}
}


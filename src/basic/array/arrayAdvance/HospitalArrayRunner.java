package basic.array.arrayAdvance;

class HospitalArrayRunner{
	public static void main(String[] args) {
		//int numbers=new int[0];
		//string[] name= new String[5];

		Hospital[] hospitals= new Hospital[2];

		Hospital hospital = new Hospital();
		hospital.setName(" CNMC");
		hospital.setAddress("kolkata");
		System.out.println(hospital.getAddress());
         
          hospitals[0]=hospital;
          Hospital hospital1=new Hospital();
          hospital1.setName("KMC");
          hospital1.setAddress("");

		hospitals[1]=hospital1;

		for(int i=0;i<hospitals.length;i++){
			System.out.println("Hospital===="+(i+1));
			Hospital localHospital = hospitals[i];
			System.out.println(localHospital.getName());
			System.out.println(localHospital.getAddress());
		}



	}
}
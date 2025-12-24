package basic.array.arrayAdvance;

class GymArrayRunner{
	public static void main(String[] args) {
		Gym[] gyms= new Gym[5];

		Gym gym= new Gym();
		gym.setTrainerName("Tabbu");
		gym.setArea("Delhi");
	//	System.out.println(company.getCompanyAddress());
		gyms[0]=gym;
		
		Gym gym1= new Gym();
		gym1.setTrainerName("Sekhar");
		gym1.setArea("Kolkata");
	//	System.out.println(company.getCompanyAddress());
		gyms[1]=gym1;
		
		
		Gym gym2= new Gym();
		gym2.setTrainerName("Alianal");
		gym2.setArea("Siliguri");
	//	System.out.println(company.getCompanyAddress());
		gyms[2]=gym2;
		
		
		Gym gym3= new Gym();
		gym3.setTrainerName("Anwar");
		gym3.setArea("Darjiling");
	//	System.out.println(company.getCompanyAddress());
		gyms[3]=gym3;
		
		Gym gym4= new Gym();
		gym4.setTrainerName("Liton");
		gym4.setArea("New town");
	//	System.out.println(company.getCompanyAddress());
		gyms[4]=gym4;
		
		

        
		for(int i=0;i<gyms.length;i++){
			System.out.println("Gym"+(i+1));
			Gym localGym= gyms[i];
			System.out.println("Trainer:"+localGym.getTrainerName());
			System.out.println("Area:"+localGym.getArea());
			System.out.println();
		}
	}
}


package basic.array.arrayAdvance;

class SchoolArrayRunner{
	public static void main(String[] args) {
		School[] schools= new School[5];

		School school= new School();
		school.setName("applo public school");
		school.setSchoolAddress("Delhi");
	//	System.out.println(school.getSchoolAddress());

		schools[0]=school;
		School school1= new School();
		school1.setName("narayana public school");
		school1.setSchoolAddress("BLR");

		schools[1]=school1;

		School school2= new School();
		school2.setName("DPS");
		school2.setSchoolAddress("Mumbai");

		schools[2]=school2;
		
		School school3= new School();
		school3.setName("aliah ");
		school3.setSchoolAddress("kolkata");

		schools[3]=school3;

		School school4= new School();
		school4.setName("army public");
		school4.setSchoolAddress("siliguri");

		schools[4]=school4;

		for(int i=0;i<schools.length;i++){
			System.out.println("Hospital======="+(i+1));
			School localSchool= schools[i];
			System.out.println(localSchool.getName());
			System.out.println(localSchool.getSchoolAddress());
			System.out.println();
		}
	}
}

	
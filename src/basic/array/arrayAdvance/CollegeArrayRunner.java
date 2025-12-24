package basic.array.arrayAdvance;

class CollegeArrayRunner{
public static void main(String[] args) {
		College[] colleges= new College[5];

		College college= new College();
		college.setCollegeName("Aliah university");
		college.setGrade('A');
	//	System.out.println(company.getCompanyAddress());
		colleges[0]=college;
		
		College college1= new College();
		college1.setCollegeName("Jadavpur university");
		college1.setGrade('B');
		colleges[1]=college;
		
		College college2= new College();
		college2.setCollegeName("Calcutta Medical Collge");
		college2.setGrade('C');
		colleges[2]=college;
		
	    College college3= new College();
		college3.setCollegeName("Aliah University");
		college3.setGrade('D');
		colleges[3]=college;
		
		
		College college4= new College();
		college4.setCollegeName("North Bengal University");
		college4.setGrade('D');
		colleges[4]=college;
		
		
		
		
		for(int i=0;i<colleges.length;i++){
			System.out.println("College"+(i+1));
			College localCollege= colleges[i];
			System.out.println(localCollege.getCollegeName());
			System.out.println(localCollege.getGrade());
			System.out.println();
		}
	}
}

	
